package pg;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import qg.e;

/* loaded from: classes.dex */
public final class c implements ng.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100041a;

    /* renamed from: b, reason: collision with root package name */
    public final wk2.a f100042b;

    public /* synthetic */ c(wk2.a aVar, int i13) {
        this.f100041a = i13;
        this.f100042b = aVar;
    }

    @Override // wk2.a
    public final Object get() {
        int i13 = this.f100041a;
        wk2.a aVar = this.f100042b;
        switch (i13) {
            case 0:
                tg.a aVar2 = (tg.a) aVar.get();
                HashMap hashMap = new HashMap();
                ig.c cVar = ig.c.DEFAULT;
                x92.b bVar = new x92.b(13);
                Set emptySet = Collections.emptySet();
                if (emptySet == null) {
                    throw new NullPointerException("Null flags");
                }
                bVar.f134367d = emptySet;
                bVar.f134365b = 30000L;
                bVar.f134366c = 86400000L;
                hashMap.put(cVar, bVar.p());
                ig.c cVar2 = ig.c.HIGHEST;
                x92.b bVar2 = new x92.b(13);
                Set emptySet2 = Collections.emptySet();
                if (emptySet2 == null) {
                    throw new NullPointerException("Null flags");
                }
                bVar2.f134367d = emptySet2;
                bVar2.f134365b = 1000L;
                bVar2.f134366c = 86400000L;
                hashMap.put(cVar2, bVar2.p());
                ig.c cVar3 = ig.c.VERY_LOW;
                x92.b bVar3 = new x92.b(13);
                Set emptySet3 = Collections.emptySet();
                if (emptySet3 == null) {
                    throw new NullPointerException("Null flags");
                }
                bVar3.f134367d = emptySet3;
                bVar3.f134365b = 86400000L;
                bVar3.f134366c = 86400000L;
                Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(e.DEVICE_IDLE)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                bVar3.f134367d = unmodifiableSet;
                hashMap.put(cVar3, bVar3.p());
                if (aVar2 == null) {
                    throw new NullPointerException("missing required property: clock");
                }
                if (hashMap.keySet().size() < ig.c.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new qg.a(aVar2, hashMap);
            default:
                String packageName = ((Context) aVar.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
