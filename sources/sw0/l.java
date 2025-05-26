package sw0;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import com.pinterest.ui.imageview.WebImageView;
import kh2.c3;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class l extends hs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebImageView f115512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f115513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f115514c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f115515d;

    public l(WebImageView webImageView, View view, Function0 function0, Function0 function02) {
        this.f115512a = webImageView;
        this.f115513b = view;
        this.f115514c = function0;
        this.f115515d = function02;
    }

    @Override // hs1.c
    public final void a(boolean z13) {
        WebImageView webImageView = this.f115512a;
        webImageView.setBackgroundColor(0);
        this.f115513b.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(c3.y(webImageView.C))));
    }

    @Override // hs1.c
    public final void d() {
        this.f115515d.invoke();
    }

    @Override // hs1.c
    public final void e() {
        this.f115514c.invoke();
    }
}
