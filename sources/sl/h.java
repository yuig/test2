package sl;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import df.j1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class h implements c, ul.a {

    /* renamed from: h, reason: collision with root package name */
    public static final g f113137h = new g(0);

    /* renamed from: e, reason: collision with root package name */
    public final l f113142e;

    /* renamed from: g, reason: collision with root package name */
    public final f f113144g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f113138a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f113139b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f113140c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f113141d = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f113143f = new AtomicReference();

    public h(Executor executor, List list, List list2, f fVar) {
        l lVar = new l(executor);
        this.f113142e = lVar;
        this.f113144g = fVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(b.c(lVar, l.class, zl.c.class, zl.b.class));
        arrayList.add(b.c(this, ul.a.class, new Class[0]));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((cm.a) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList.addAll(this.f113144g.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e13) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e13);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object[] array = ((b) it4.next()).f113128b.toArray();
                int length = array.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        Object obj = array[i13];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f113141d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f113141d.add(obj.toString());
                        }
                        i13++;
                    }
                }
            }
            if (this.f113138a.isEmpty()) {
                j1.L(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f113138a.keySet());
                arrayList4.addAll(arrayList);
                j1.L(arrayList4);
            }
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                b bVar2 = (b) it5.next();
                this.f113138a.put(bVar2, new m(new nl.c(1, this, bVar2)));
            }
            arrayList3.addAll(i(arrayList));
            arrayList3.addAll(j());
            h();
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f113143f.get();
        if (bool != null) {
            g(this.f113138a, bool.booleanValue());
        }
    }

    @Override // sl.c
    public final synchronized cm.a c(q qVar) {
        dl2.b.H(qVar, "Null interface requested.");
        return (cm.a) this.f113139b.get(qVar);
    }

    @Override // sl.c
    public final synchronized cm.a d(q qVar) {
        n nVar = (n) this.f113140c.get(qVar);
        if (nVar != null) {
            return nVar;
        }
        return f113137h;
    }

    public final void g(Map map, boolean z13) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            b bVar = (b) entry.getKey();
            cm.a aVar = (cm.a) entry.getValue();
            int i13 = bVar.f113130d;
            if (i13 == 1 || (i13 == 2 && z13)) {
                aVar.get();
            }
        }
        l lVar = this.f113142e;
        synchronized (lVar) {
            arrayDeque = lVar.f113154b;
            if (arrayDeque != null) {
                lVar.f113154b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                ep.b.A(it.next());
                throw null;
            }
        }
    }

    public final void h() {
        for (b bVar : this.f113138a.keySet()) {
            for (k kVar : bVar.f113129c) {
                if (kVar.f113151b == 2 && !this.f113140c.containsKey(kVar.f113150a)) {
                    HashMap hashMap = this.f113140c;
                    q qVar = kVar.f113150a;
                    Set emptySet = Collections.emptySet();
                    n nVar = new n();
                    nVar.f113160b = null;
                    nVar.f113159a = Collections.newSetFromMap(new ConcurrentHashMap());
                    nVar.f113159a.addAll(emptySet);
                    hashMap.put(qVar, nVar);
                } else if (this.f113139b.containsKey(kVar.f113150a)) {
                    continue;
                } else {
                    int i13 = kVar.f113151b;
                    if (i13 == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + bVar + ": " + kVar.f113150a);
                    }
                    if (i13 != 2) {
                        HashMap hashMap2 = this.f113139b;
                        q qVar2 = kVar.f113150a;
                        fl.q qVar3 = o.f113161c;
                        g gVar = o.f113162d;
                        o oVar = new o();
                        oVar.f113163a = qVar3;
                        oVar.f113164b = gVar;
                        hashMap2.put(qVar2, oVar);
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f113131e == 0) {
                cm.a aVar = (cm.a) this.f113138a.get(bVar);
                for (q qVar : bVar.f113128b) {
                    HashMap hashMap = this.f113139b;
                    if (hashMap.containsKey(qVar)) {
                        arrayList2.add(new e5.k(19, (o) ((cm.a) hashMap.get(qVar)), aVar));
                    } else {
                        hashMap.put(qVar, aVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f113138a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f113131e != 0) {
                cm.a aVar = (cm.a) entry.getValue();
                for (q qVar : bVar.f113128b) {
                    if (!hashMap.containsKey(qVar)) {
                        hashMap.put(qVar, new HashSet());
                    }
                    ((Set) hashMap.get(qVar)).add(aVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f113140c;
            if (hashMap2.containsKey(key)) {
                n nVar = (n) hashMap2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new e5.k(20, nVar, (cm.a) it.next()));
                }
            } else {
                q qVar2 = (q) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                n nVar2 = new n();
                nVar2.f113160b = null;
                nVar2.f113159a = Collections.newSetFromMap(new ConcurrentHashMap());
                nVar2.f113159a.addAll(set);
                hashMap2.put(qVar2, nVar2);
            }
        }
        return arrayList;
    }
}
