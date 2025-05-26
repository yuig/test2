package z9;

import a.cb;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class z {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f141321j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f141322a;

    /* renamed from: b, reason: collision with root package name */
    public b0 f141323b;

    /* renamed from: c, reason: collision with root package name */
    public String f141324c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f141325d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f141326e;

    /* renamed from: f, reason: collision with root package name */
    public final g1.p0 f141327f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f141328g;

    /* renamed from: h, reason: collision with root package name */
    public int f141329h;

    /* renamed from: i, reason: collision with root package name */
    public String f141330i;

    static {
        new LinkedHashMap();
    }

    public z(r0 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        LinkedHashMap linkedHashMap = s0.f141286b;
        String navigatorName = g4.u.n0(navigator.getClass());
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.f141322a = navigatorName;
        this.f141326e = new ArrayList();
        this.f141327f = new g1.p0(0);
        this.f141328g = new LinkedHashMap();
    }

    public final void b(w navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        ArrayList H1 = kh2.b0.H1(this.f141328g, new z3.m(navDeepLink, 3));
        if (H1.isEmpty()) {
            this.f141326e.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.f141297a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + H1).toString());
    }

    public final Bundle c(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f141328g;
        if (bundle == null && (linkedHashMap == null || linkedHashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            g gVar = (g) entry.getValue();
            gVar.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(bundle2, "bundle");
            if (gVar.f141186c) {
                gVar.f141184a.e(bundle2, name, gVar.f141187d);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                g gVar2 = (g) entry2.getValue();
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(name2, "name");
                Intrinsics.checkNotNullParameter(bundle2, "bundle");
                boolean z13 = gVar2.f141185b;
                o0 o0Var = gVar2.f141184a;
                if (z13 || !bundle2.containsKey(name2) || bundle2.get(name2) != null) {
                    try {
                        o0Var.a(name2, bundle2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder o13 = cb.o("Wrong argument type for '", name2, "' in argument bundle. ");
                o13.append(o0Var.b());
                o13.append(" expected.");
                throw new IllegalArgumentException(o13.toString().toString());
            }
        }
        return bundle2;
    }

    public final int[] d(z zVar) {
        kotlin.collections.v vVar = new kotlin.collections.v();
        z zVar2 = this;
        while (true) {
            b0 b0Var = zVar2.f141323b;
            if ((zVar != null ? zVar.f141323b : null) != null) {
                b0 b0Var2 = zVar.f141323b;
                Intrinsics.f(b0Var2);
                if (b0Var2.s(zVar2.f141329h, true) == zVar2) {
                    vVar.addFirst(zVar2);
                    break;
                }
            }
            if (b0Var == null || b0Var.f141161l != zVar2.f141329h) {
                vVar.addFirst(zVar2);
            }
            if (Intrinsics.d(b0Var, zVar) || b0Var == null) {
                break;
            }
            zVar2 = b0Var;
        }
        List F0 = CollectionsKt.F0(vVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(F0, 10));
        Iterator it = F0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((z) it.next()).f141329h));
        }
        return CollectionsKt.E0(arrayList);
    }

    public final f e(int i13) {
        g1.p0 p0Var = this.f141327f;
        f fVar = p0Var.k() == 0 ? null : (f) p0Var.g(i13);
        if (fVar != null) {
            return fVar;
        }
        b0 b0Var = this.f141323b;
        if (b0Var != null) {
            return b0Var.e(i13);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto Lb4
            boolean r2 = r9 instanceof z9.z
            if (r2 != 0) goto Ld
            goto Lb4
        Ld:
            java.util.ArrayList r2 = r8.f141326e
            z9.z r9 = (z9.z) r9
            java.util.ArrayList r3 = r9.f141326e
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            g1.p0 r3 = r8.f141327f
            int r4 = r3.k()
            g1.p0 r5 = r9.f141327f
            int r6 = r5.k()
            if (r4 != r6) goto L58
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            g1.r0 r4 = new g1.r0
            r4.<init>(r3, r1)
            kotlin.sequences.Sequence r4 = yn2.x.c(r4)
            java.util.Iterator r4 = r4.iterator()
        L37:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L56
            java.lang.Object r6 = r4.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r7 = r3.g(r6)
            java.lang.Object r6 = r5.g(r6)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r7, r6)
            if (r6 != 0) goto L37
            goto L58
        L56:
            r3 = r0
            goto L59
        L58:
            r3 = r1
        L59:
            java.util.LinkedHashMap r4 = r8.f141328g
            int r5 = r4.size()
            java.util.LinkedHashMap r6 = r9.f141328g
            int r7 = r6.size()
            if (r5 != r7) goto L9a
            q5.w0 r4 = kotlin.collections.b1.s(r4)
            java.util.Iterator r4 = r4.iterator()
        L6f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L98
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r7 = r5.getKey()
            boolean r7 = r6.containsKey(r7)
            if (r7 == 0) goto L9a
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r7 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r7, r5)
            if (r5 == 0) goto L9a
            goto L6f
        L98:
            r4 = r0
            goto L9b
        L9a:
            r4 = r1
        L9b:
            int r5 = r8.f141329h
            int r6 = r9.f141329h
            if (r5 != r6) goto Lb2
            java.lang.String r5 = r8.f141330i
            java.lang.String r9 = r9.f141330i
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r5, r9)
            if (r9 == 0) goto Lb2
            if (r2 == 0) goto Lb2
            if (r3 == 0) goto Lb2
            if (r4 == 0) goto Lb2
            goto Lb3
        Lb2:
            r0 = r1
        Lb3:
            return r0
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.z.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0104, code lost:
    
        if ((!kh2.b0.H1(r2, new z9.v(0, r12)).isEmpty()) != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z9.y f(androidx.appcompat.app.d r19) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.z.f(androidx.appcompat.app.d):z9.y");
    }

    public int hashCode() {
        Set<String> keySet;
        int i13 = this.f141329h * 31;
        String str = this.f141330i;
        int hashCode = i13 + (str != null ? str.hashCode() : 0);
        Iterator it = this.f141326e.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            int i14 = hashCode * 31;
            String str2 = wVar.f141297a;
            int hashCode2 = (i14 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = wVar.f141298b;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = wVar.f141299c;
            hashCode = hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        g1.p0 p0Var = this.f141327f;
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        g1.s0 s0Var = new g1.s0(p0Var);
        while (s0Var.hasNext()) {
            f fVar = (f) s0Var.next();
            int i15 = ((hashCode * 31) + fVar.f141178a) * 31;
            g0 g0Var = fVar.f141179b;
            hashCode = i15 + (g0Var != null ? g0Var.hashCode() : 0);
            Bundle bundle = fVar.f141180c;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                Intrinsics.checkNotNullExpressionValue(keySet, "keySet()");
                for (String str5 : keySet) {
                    int i16 = hashCode * 31;
                    Bundle bundle2 = fVar.f141180c;
                    Intrinsics.f(bundle2);
                    Object obj = bundle2.get(str5);
                    hashCode = i16 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        LinkedHashMap linkedHashMap = this.f141328g;
        for (String str6 : linkedHashMap.keySet()) {
            int d2 = cb.d(str6, hashCode * 31, 31);
            Object obj2 = linkedHashMap.get(str6);
            hashCode = d2 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return hashCode;
    }

    public final y i(String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri uri = Uri.parse(g4.u.a0(route));
        Intrinsics.e(uri, "Uri.parse(this)");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(uri, "uri");
        androidx.appcompat.app.d dVar = new androidx.appcompat.app.d(uri, null, null, 20);
        return this instanceof b0 ? ((b0) this).u(dVar) : f(dVar);
    }

    public void j(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, aa.a.Navigator);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        p(obtainAttributes.getString(aa.a.Navigator_route));
        if (obtainAttributes.hasValue(aa.a.Navigator_android_id)) {
            int resourceId = obtainAttributes.getResourceId(aa.a.Navigator_android_id, 0);
            this.f141329h = resourceId;
            this.f141324c = null;
            this.f141324c = g4.u.k0(context, resourceId);
        }
        this.f141325d = obtainAttributes.getText(aa.a.Navigator_android_label);
        Unit unit = Unit.f80348a;
        obtainAttributes.recycle();
    }

    public final void n(int i13, f action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(this instanceof a)) {
            if (i13 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
            }
            this.f141327f.j(i13, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i13 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void p(String str) {
        Object obj = null;
        if (str == null) {
            this.f141329h = 0;
            this.f141324c = null;
        } else {
            if (!(!kotlin.text.z.j(str))) {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
            String uriPattern = g4.u.a0(str);
            this.f141329h = uriPattern.hashCode();
            this.f141324c = null;
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            b(new w(uriPattern, null, null));
        }
        ArrayList arrayList = this.f141326e;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.d(((w) next).f141297a, g4.u.a0(this.f141330i))) {
                obj = next;
                break;
            }
        }
        dl2.b.s(arrayList).remove(obj);
        this.f141330i = str;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getClass().getSimpleName());
        sb3.append("(");
        String str = this.f141324c;
        if (str == null) {
            sb3.append("0x");
            sb3.append(Integer.toHexString(this.f141329h));
        } else {
            sb3.append(str);
        }
        sb3.append(")");
        String str2 = this.f141330i;
        if (str2 != null && !kotlin.text.z.j(str2)) {
            sb3.append(" route=");
            sb3.append(this.f141330i);
        }
        if (this.f141325d != null) {
            sb3.append(" label=");
            sb3.append(this.f141325d);
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "sb.toString()");
        return sb4;
    }
}
