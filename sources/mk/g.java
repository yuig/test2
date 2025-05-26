package mk;

import android.content.Context;
import java.io.File;
import jk.l;
import jk.m;
import jk.u;
import jk.w;
import kk.n;
import kk.o;

/* loaded from: classes.dex */
public final class g implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87313a;

    /* renamed from: b, reason: collision with root package name */
    public final o f87314b;

    /* renamed from: c, reason: collision with root package name */
    public final o f87315c;

    /* renamed from: d, reason: collision with root package name */
    public final o f87316d;

    /* renamed from: e, reason: collision with root package name */
    public final o f87317e;

    public /* synthetic */ g(o oVar, o oVar2, o oVar3, o oVar4, int i13) {
        this.f87313a = i13;
        this.f87314b = oVar;
        this.f87315c = oVar2;
        this.f87316d = oVar3;
        this.f87317e = oVar4;
    }

    @Override // kk.o
    public final Object zza() {
        int i13 = this.f87313a;
        o oVar = this.f87317e;
        o oVar2 = this.f87316d;
        o oVar3 = this.f87315c;
        o oVar4 = this.f87314b;
        switch (i13) {
            case 0:
                Context context = ((jk.f) oVar4).f76334a.f67746a;
                if (context != null) {
                    return new a(context, (File) oVar3.zza(), (u) oVar2.zza(), n.a(oVar));
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new jk.e((l) oVar4.zza(), (w) oVar3.zza(), (u) oVar2.zza(), (m) oVar.zza());
        }
    }
}
