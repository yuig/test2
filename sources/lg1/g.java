package lg1;

import com.pinterest.api.model.d30;
import jg1.r;
import l7.j;
import oy.b1;
import s92.o;

/* loaded from: classes5.dex */
public final class g implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f83259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f83260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d30 f83261c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f83262d;

    public g(long j13, d30 d30Var, h hVar, String str) {
        this.f83259a = str;
        this.f83260b = hVar;
        this.f83261c = d30Var;
        this.f83262d = j13;
    }

    @Override // jg1.r
    public final void a(Exception exc) {
        new b1(this.f83259a, o.ERROR, String.valueOf(exc)).i();
        h hVar = this.f83260b;
        hVar.f83265c.post(new y9.b(hVar, this.f83261c, exc, this.f83262d, 2));
    }

    @Override // jg1.r
    public final void b() {
        new b1(this.f83259a, o.COMPLETE, null).i();
        h hVar = this.f83260b;
        hVar.f83265c.post(new y9.b(hVar, this.f83261c, this.f83259a, this.f83262d, 1));
    }

    @Override // jg1.r
    public final void onCanceled() {
        new b1(this.f83259a, o.ABORTED, null).i();
        h hVar = this.f83260b;
        hVar.f83265c.post(new j(hVar, this.f83261c, this.f83262d, 5));
    }
}
