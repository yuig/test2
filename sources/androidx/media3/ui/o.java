package androidx.media3.ui;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.y2;

/* loaded from: classes3.dex */
public final class o extends y2 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f19065u;

    /* renamed from: v, reason: collision with root package name */
    public final View f19066v;

    public o(View view) {
        super(view);
        if (d7.n0.f53866a < 26) {
            view.setFocusable(true);
        }
        this.f19065u = (TextView) view.findViewById(h0.exo_text);
        this.f19066v = view.findViewById(h0.exo_check);
    }
}
