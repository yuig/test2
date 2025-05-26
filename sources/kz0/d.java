package kz0;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.pinterest.ui.imageview.WebImageView;
import kh2.b0;
import kotlin.jvm.internal.Intrinsics;
import oy.f0;
import oy.g0;
import oy.m0;
import oy.n0;
import sf1.s;

/* loaded from: classes5.dex */
public final class d extends hs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f81148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f81149c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f81150d;

    public d(Object obj, Object obj2, Object obj3, int i13) {
        this.f81147a = i13;
        this.f81148b = obj;
        this.f81149c = obj2;
        this.f81150d = obj3;
    }

    @Override // hs1.c
    public final void b() {
        switch (this.f81147a) {
            case 0:
                f fVar = (f) this.f81148b;
                String str = null;
                Bitmap Q1 = b0.Q1(fVar, null, 0, 3);
                Object obj = this.f81149c;
                if (Q1 != null) {
                    e01.a aVar = (e01.a) this.f81150d;
                    Context context = ((WebImageView) obj).getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    aVar.getClass();
                    str = e01.a.a(context, Q1);
                }
                fVar.f81156e = str;
                WebImageView webImageView = (WebImageView) obj;
                ViewGroup.LayoutParams layoutParams = webImageView.getLayoutParams();
                layoutParams.height = (webImageView.k0() * webImageView.getMeasuredWidth()) / webImageView.z1();
                webImageView.setLayoutParams(layoutParams);
                break;
        }
    }

    @Override // hs1.c
    public final void d() {
        switch (this.f81147a) {
            case 1:
                String str = (String) this.f81148b;
                new g0(str).i();
                new m0(a.a.D(str, "-", (String) this.f81149c)).i();
                ((s) this.f81150d).s().d(new sf1.g(str));
                break;
        }
    }

    @Override // hs1.c
    public final void e() {
        switch (this.f81147a) {
            case 1:
                String str = (String) this.f81148b;
                new f0(str, null, 14).i();
                new n0(a.a.D(str, "-", (String) this.f81149c)).i();
                ((s) this.f81150d).s().d(new sf1.g(str));
                break;
        }
    }
}
