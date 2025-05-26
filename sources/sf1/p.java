package sf1;

import com.pinterest.ui.imageview.WebImageView;
import ey.e4;
import ey.k4;
import java.io.File;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends hs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebImageView f112672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f112673b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f112674c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f112675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f112676e;

    public p(WebImageView webImageView, boolean z13, String str, String str2, s sVar) {
        this.f112672a = webImageView;
        this.f112673b = z13;
        this.f112674c = str;
        this.f112675d = str2;
        this.f112676e = sVar;
    }

    @Override // hs1.c
    public final void a(boolean z13) {
        String str;
        WebImageView j13;
        hs1.x xVar = this.f112672a.D;
        if (xVar == null || (str = xVar.toString()) == null) {
            str = "UNDEFINED";
        }
        boolean z14 = this.f112673b;
        String str2 = this.f112674c;
        if (z14) {
            new k4(str2, str).i();
        } else {
            new oy.f0(str2, str, 6).i();
            StringBuilder D = ep.b.D(str2, "-");
            D.append(this.f112675d);
            new oy.n0(D.toString()).i();
        }
        s sVar = this.f112676e;
        sVar.s().d(new g(str2));
        v0 v0Var = sVar.M;
        if (v0Var != null) {
            oq.c0 c0Var = (oq.c0) v0Var;
            if (!c0Var.o() && (j13 = c0Var.j()) != null) {
                j13.setBackgroundResource(0);
            }
            c0Var.T.c(new oq.v());
        }
    }

    @Override // hs1.c
    public final void d() {
        String str;
        if (this.f112673b) {
            new e4(s92.o.ERROR, this.f112674c).i();
        } else {
            new oy.g0(this.f112674c).i();
            new oy.m0(a.a.D(this.f112674c, "-", this.f112675d)).i();
        }
        this.f112676e.s().d(new g(this.f112674c));
        s sVar = this.f112676e;
        v0 v0Var = sVar.M;
        ag1.f fVar = sVar.f112706m;
        if (fVar == null) {
            Intrinsics.r("ideaPinMediaCache");
            throw null;
        }
        Pair pinIdAndPageIndex = new Pair(this.f112674c, this.f112675d);
        synchronized (fVar) {
            Intrinsics.checkNotNullParameter(pinIdAndPageIndex, "pinIdAndPageIndex");
            str = (String) fVar.f15143a.get(pinIdAndPageIndex);
        }
        if (str != null) {
            WebImageView webImageView = this.f112672a;
            File file = new File(str);
            if (file.exists()) {
                webImageView.t2(file);
            }
        }
    }
}
