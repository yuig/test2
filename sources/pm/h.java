package pm;

import com.google.gson.reflect.TypeToken;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import nm.i0;
import nm.j0;

/* loaded from: classes.dex */
public final class h implements j0, Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public static final h f100591f = new h();

    /* renamed from: a, reason: collision with root package name */
    public final double f100592a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    public int f100593b = RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f100594c = true;

    /* renamed from: d, reason: collision with root package name */
    public List f100595d = Collections.emptyList();

    /* renamed from: e, reason: collision with root package name */
    public List f100596e = Collections.emptyList();

    public static boolean g(Class cls) {
        if (cls.isMemberClass()) {
            so.a aVar = sm.c.f113229a;
            if (!Modifier.isStatic(cls.getModifiers())) {
                return true;
            }
        }
        return false;
    }

    @Override // nm.j0
    public final i0 a(nm.o oVar, TypeToken typeToken) {
        Class cls = typeToken.f33846a;
        boolean c13 = c(cls, true);
        boolean c14 = c(cls, false);
        if (c13 || c14) {
            return new g(this, c14, c13, oVar, typeToken);
        }
        return null;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h clone() {
        try {
            return (h) super.clone();
        } catch (CloneNotSupportedException e13) {
            throw new AssertionError(e13);
        }
    }

    public final boolean c(Class cls, boolean z13) {
        if (this.f100592a != -1.0d && !h((om.c) cls.getAnnotation(om.c.class), (om.d) cls.getAnnotation(om.d.class))) {
            return true;
        }
        if (!this.f100594c && g(cls)) {
            return true;
        }
        if (!z13 && !Enum.class.isAssignableFrom(cls)) {
            so.a aVar = sm.c.f113229a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z13 ? this.f100595d : this.f100596e).iterator();
        while (it.hasNext()) {
            ((jb0.b) it.next()).getClass();
        }
        return false;
    }

    public final boolean h(om.c cVar, om.d dVar) {
        double d2 = this.f100592a;
        return (cVar == null || d2 >= cVar.value()) && (dVar == null || d2 < dVar.value());
    }

    public final h i(jb0.b bVar, boolean z13, boolean z14) {
        h clone = clone();
        if (z13) {
            ArrayList arrayList = new ArrayList(this.f100595d);
            clone.f100595d = arrayList;
            arrayList.add(bVar);
        }
        if (z14) {
            ArrayList arrayList2 = new ArrayList(this.f100596e);
            clone.f100596e = arrayList2;
            arrayList2.add(bVar);
        }
        return clone;
    }
}
