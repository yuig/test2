package os;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.spinner.GestaltSpinner;

/* loaded from: classes.dex */
public final class e extends y2 {
    public e(View view, RecyclerView recyclerView) {
        super(view);
        ((GestaltSpinner) view.findViewById(nl1.e.loading_spinner)).u(new d(0));
        f.D(view, recyclerView);
    }
}
