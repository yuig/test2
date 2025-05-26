package pd;

import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.components.DependencyException;
import java.util.Set;

/* loaded from: classes.dex */
public final class s implements sl.c, tc2.b {

    /* renamed from: a */
    public Object f99747a;

    /* renamed from: b */
    public Object f99748b;

    /* renamed from: c */
    public Object f99749c;

    /* renamed from: d */
    public Object f99750d;

    /* renamed from: e */
    public Object f99751e;

    /* renamed from: f */
    public Object f99752f;

    /* renamed from: g */
    public Object f99753g;

    @Override // sl.c
    public final Object a(Class cls) {
        if (!((Set) this.f99747a).contains(sl.q.a(cls))) {
            throw new DependencyException("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a13 = ((sl.c) this.f99753g).a(cls);
        if (!cls.equals(zl.b.class)) {
            return a13;
        }
        return new sl.r();
    }

    @Override // sl.c
    public final Set b(sl.q qVar) {
        if (((Set) this.f99750d).contains(qVar)) {
            return ((sl.c) this.f99753g).b(qVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Set<" + qVar + ">.");
    }

    @Override // sl.c
    public final cm.a c(sl.q qVar) {
        if (((Set) this.f99748b).contains(qVar)) {
            return ((sl.c) this.f99753g).c(qVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<" + qVar + ">.");
    }

    @Override // sl.c
    public final cm.a d(sl.q qVar) {
        if (((Set) this.f99751e).contains(qVar)) {
            return ((sl.c) this.f99753g).d(qVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<Set<" + qVar + ">>.");
    }

    @Override // sl.c
    public final Object e(sl.q qVar) {
        if (((Set) this.f99747a).contains(qVar)) {
            return ((sl.c) this.f99753g).e(qVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + qVar + ".");
    }

    @Override // sl.c
    public final cm.a f(Class cls) {
        return c(sl.q.a(cls));
    }

    public final em.a g() {
        String str = ((em.c) this.f99748b) == null ? " registrationStatus" : "";
        if (((Long) this.f99751e) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f99752f) == null) {
            str = a.a.C(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new em.a((String) this.f99747a, (em.c) this.f99748b, (String) this.f99749c, (String) this.f99750d, ((Long) this.f99751e).longValue(), ((Long) this.f99752f).longValue(), (String) this.f99753g);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final nl.i h() {
        return new nl.i((String) this.f99748b, (String) this.f99747a, (String) this.f99749c, (String) this.f99750d, (String) this.f99751e, (String) this.f99752f, (String) this.f99753g);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0097 A[Catch: NumberFormatException -> 0x01ad, TryCatch #0 {NumberFormatException -> 0x01ad, blocks: (B:3:0x0011, B:5:0x0024, B:6:0x0027, B:8:0x0033, B:9:0x0036, B:11:0x0046, B:18:0x005a, B:21:0x006c, B:22:0x007d, B:24:0x0097, B:27:0x00c4, B:29:0x00cc, B:30:0x00f2, B:32:0x0063, B:35:0x006f, B:38:0x0078, B:39:0x007b), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4 A[Catch: NumberFormatException -> 0x01ad, TryCatch #0 {NumberFormatException -> 0x01ad, blocks: (B:3:0x0011, B:5:0x0024, B:6:0x0027, B:8:0x0033, B:9:0x0036, B:11:0x0046, B:18:0x005a, B:21:0x006c, B:22:0x007d, B:24:0x0097, B:27:0x00c4, B:29:0x00cc, B:30:0x00f2, B:32:0x0063, B:35:0x006f, B:38:0x0078, B:39:0x007b), top: B:2:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(android.net.Uri r16, java.util.List r17, boolean r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.s.i(android.net.Uri, java.util.List, boolean, java.lang.String):void");
    }

    public final void j(int i13) {
        if (((ViewGroup) this.f99749c).isAttachedToWindow()) {
            int childCount = ((ViewGroup) this.f99749c).getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = ((ViewGroup) this.f99749c).getChildAt(i14);
                if (childAt.getId() == i13) {
                    ((ViewGroup) this.f99749c).removeView(childAt);
                    return;
                }
            }
        }
    }

    public final void k(em.c cVar) {
        if (cVar == null) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.f99748b = cVar;
    }
}
