package apps.dailyvery.com.denissoundboard;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by justefani on 27/07/2017.
 */

public class ImageAdapter extends BaseAdapter{
    private Context mContext;
    private Activity activity;

    public ImageAdapter(Activity activity) {
        this.activity = activity;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return mThumbIds[position];
    }

    public long getItemId(int position) {
        return 0;
    }
    public static class ViewHolder
    {
        public ImageView imgViewFlag;
        public TextView txtViewTitle;
    }


    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder v;
        LayoutInflater li = activity.getLayoutInflater();
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
//            imageView = new ImageView(mContext);
//            imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            imageView.setPadding(8, 8, 8, 8);

            v = new ViewHolder();
            convertView = li.inflate(R.layout.image_adapter_layout, null);
            v.txtViewTitle = (TextView) convertView.findViewById(R.id.icon_text);
            v.imgViewFlag = (ImageView) convertView.findViewById(R.id.icon_image);

            convertView.setTag(v);
        } else {
            v = (ViewHolder) convertView.getTag();
        }

        v.txtViewTitle.setText(mThumbTx[position]);
        v.imgViewFlag.setImageResource(mThumbIds[position]);
        return convertView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.ic_denis_ah, R.drawable.ic_denis_ah,
            R.drawable.ic_denis_ah, R.drawable.ic_denis_ah,
            R.drawable.ic_denis_ah, R.drawable.ic_denis_ah,
            R.drawable.ic_denis_ah, R.drawable.ic_denis_ah,
            R.drawable.ic_denis_ah, R.drawable.ic_denis_ah,
            R.drawable.ic_denis_ah, R.drawable.ic_denis_ah,
            R.drawable.ic_denis_ah, R.drawable.ic_denis_ah
    };

    private String[] mThumbTx = {
            "Ah","Ah",
            "Ah","Ah",
            "Ah","Ah",
            "Ah","Ah",
            "Ah","Ah",
            "Ah","Ah",
            "Ah","Ah"
    };
}
