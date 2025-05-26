package androidx.media3.ui;

import a.l2;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.y2;

/* loaded from: classes3.dex */
public final class m extends y2 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f19050y = 0;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f19051u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f19052v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f19053w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PlayerControlView f19054x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(PlayerControlView playerControlView, View view) {
        super(view);
        this.f19054x = playerControlView;
        if (d7.n0.f53866a < 26) {
            view.setFocusable(true);
        }
        this.f19051u = (TextView) view.findViewById(h0.exo_main_text);
        this.f19052v = (TextView) view.findViewById(h0.exo_sub_text);
        this.f19053w = (ImageView) view.findViewById(h0.exo_icon);
        view.setOnClickListener(new l2(this, 3));
    }
}
