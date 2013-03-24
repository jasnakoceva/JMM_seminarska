package ukim.finki.slagalica.adapters;
import java.util.ArrayList;
import java.util.List;


import ukim.finki.slagalica.R;
import ukim.finki.slagalica.model.ScoreItem;


import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HighScoresAdapter  extends BaseAdapter {

	private List<ScoreItem> items;
	private Context ctx;
	private LayoutInflater inflater;

	public HighScoresAdapter(Context ctx) {
		items = new ArrayList<ScoreItem>();
		this.ctx = ctx;
		inflater = (LayoutInflater) ctx
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	public HighScoresAdapter(List<ScoreItem> items, Context ctx) {
		this.items = items;
		this.ctx = ctx;
		inflater = (LayoutInflater) this.ctx
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return items.size();
	}

	@Override
	public Object getItem(int position) {
		return items.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	class ScoreHolder {
		public RelativeLayout itemLayout;
		public TextView name;
		public TextView date;
		public TextView score;
		public TextView id;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ScoreItem item = items.get(position);
		ScoreHolder holder = null;
		if (convertView == null) {
			holder = new ScoreHolder();
			holder.itemLayout = (RelativeLayout) inflater.inflate(
					R.layout.score_item, null);

			holder.name = (TextView) holder.itemLayout.findViewById(R.id.hs_name);
			
			holder.date = (TextView) holder.itemLayout.findViewById(R.id.hs_date);
			
			holder.score = (TextView) holder.itemLayout.findViewById(R.id.hs_points);
			
		    holder.id = (TextView) holder.itemLayout.findViewById(R.id.hs_id);
			
			convertView = holder.itemLayout;
			convertView.setTag(holder);

		}

		holder = (ScoreHolder) convertView.getTag();

		holder.name.setText(item.getName());
		holder.date.setText(item.getDate().toString());
     	holder.score.setText(Integer.toString(item.getScore()));
	    holder.id.setText("1");

		
		return convertView;
	}

	
	public void add(ScoreItem item) {
		items.add(item);
		notifyDataSetChanged();
	}
	

	

}
