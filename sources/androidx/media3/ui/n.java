package androidx.media3.ui;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;

/* loaded from: classes3.dex */
public final class n extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final String[] f19055d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f19056e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable[] f19057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PlayerControlView f19058g;

    public n(PlayerControlView playerControlView, String[] strArr, Drawable[] drawableArr) {
        this.f19058g = playerControlView;
        this.f19055d = strArr;
        this.f19056e = new String[strArr.length];
        this.f19057f = drawableArr;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f19055d.length;
    }

    @Override // androidx.recyclerview.widget.b2
    public final long f(int i13) {
        return i13;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        m mVar = (m) y2Var;
        float[] fArr = PlayerControlView.U;
        this.f19058g.getClass();
        mVar.f19717a.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
        mVar.f19051u.setText(this.f19055d[i13]);
        String str = this.f19056e[i13];
        TextView textView = mVar.f19052v;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.f19057f[i13];
        ImageView imageView = mVar.f19053w;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView recyclerView, int i13) {
        PlayerControlView playerControlView = this.f19058g;
        return new m(playerControlView, LayoutInflater.from(playerControlView.getContext()).inflate(j0.exo_styled_settings_list_item, (ViewGroup) recyclerView, false));
    }
}
