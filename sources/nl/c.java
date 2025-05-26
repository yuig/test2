package nl;

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import pd.s;
import sl.k;
import sl.q;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements cm.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f91209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f91210c;

    public /* synthetic */ c(int i13, Object obj, Object obj2) {
        this.f91208a = i13;
        this.f91209b = obj;
        this.f91210c = obj2;
    }

    @Override // cm.a
    public final Object get() {
        int i13 = this.f91208a;
        Object obj = this.f91209b;
        Object obj2 = this.f91210c;
        switch (i13) {
            case 0:
                g gVar = (g) obj;
                String d2 = gVar.d();
                return new gm.a((Context) obj2, d2);
            case 1:
                sl.h hVar = (sl.h) obj;
                sl.b bVar = (sl.b) obj2;
                hVar.getClass();
                sl.e eVar = bVar.f113132f;
                s sVar = new s();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                for (k kVar : bVar.f113129c) {
                    int i14 = kVar.f113152c;
                    boolean z13 = i14 == 0;
                    int i15 = kVar.f113151b;
                    q qVar = kVar.f113150a;
                    if (z13) {
                        if (i15 == 2) {
                            hashSet4.add(qVar);
                        } else {
                            hashSet.add(qVar);
                        }
                    } else if (i14 == 2) {
                        hashSet3.add(qVar);
                    } else if (i15 == 2) {
                        hashSet5.add(qVar);
                    } else {
                        hashSet2.add(qVar);
                    }
                }
                Set set = bVar.f113133g;
                if (!set.isEmpty()) {
                    hashSet.add(q.a(zl.b.class));
                }
                sVar.f99747a = Collections.unmodifiableSet(hashSet);
                sVar.f99748b = Collections.unmodifiableSet(hashSet2);
                sVar.f99749c = Collections.unmodifiableSet(hashSet3);
                sVar.f99750d = Collections.unmodifiableSet(hashSet4);
                sVar.f99751e = Collections.unmodifiableSet(hashSet5);
                sVar.f99752f = set;
                sVar.f99753g = hVar;
                return eVar.e(sVar);
            default:
                return new am.h((Context) obj2, (String) obj);
        }
    }

    public /* synthetic */ c(Context context, String str) {
        this.f91208a = 2;
        this.f91210c = context;
        this.f91209b = str;
    }
}
