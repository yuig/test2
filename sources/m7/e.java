package m7;

import android.content.Context;
import java.util.HashMap;
import pk.v2;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements ok.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f86147b;

    public /* synthetic */ e(Context context, int i13) {
        this.f86146a = i13;
        this.f86147b = context;
    }

    @Override // ok.g0
    public final Object get() {
        l8.o oVar;
        switch (this.f86146a) {
            case 0:
                return b7.c.s(this.f86147b);
            case 1:
                return new q(this.f86147b);
            case 2:
                return new g8.q(new g7.j(this.f86147b, new g7.l()), new q8.q());
            case 3:
                return new k8.q(this.f86147b);
            default:
                Context context = this.f86147b;
                v2 v2Var = l8.o.f82053q;
                synchronized (l8.o.class) {
                    try {
                        if (l8.o.f82059w == null) {
                            Context applicationContext = context == null ? null : context.getApplicationContext();
                            d7.g0 g0Var = d7.e.f53809a;
                            HashMap hashMap = new HashMap(8);
                            hashMap.put(0, 1000000L);
                            hashMap.put(2, -9223372036854775807L);
                            hashMap.put(3, -9223372036854775807L);
                            hashMap.put(4, -9223372036854775807L);
                            hashMap.put(5, -9223372036854775807L);
                            hashMap.put(10, -9223372036854775807L);
                            hashMap.put(9, -9223372036854775807L);
                            hashMap.put(7, -9223372036854775807L);
                            l8.o.f82059w = new l8.o(applicationContext, hashMap, 2000, g0Var, true);
                        }
                        oVar = l8.o.f82059w;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return oVar;
        }
    }
}
