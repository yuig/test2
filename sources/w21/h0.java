package w21;

import com.pinterest.api.model.i50;
import com.pinterest.api.model.y40;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final ug0.i f127699a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f127700b;

    /* renamed from: c, reason: collision with root package name */
    public final ll.j f127701c;

    /* renamed from: d, reason: collision with root package name */
    public final i92.k f127702d;

    public h0(ug0.i experiencesApi, b0 pinOrSpinSelectionRepository, ll.j screenNavigator, i92.k toastUtils) {
        Intrinsics.checkNotNullParameter(experiencesApi, "experiencesApi");
        Intrinsics.checkNotNullParameter(pinOrSpinSelectionRepository, "pinOrSpinSelectionRepository");
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        this.f127699a = experiencesApi;
        this.f127700b = pinOrSpinSelectionRepository;
        this.f127701c = screenNavigator;
        this.f127702d = toastUtils;
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        v1 request = (v1) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z13 = request instanceof i1;
        b0 b0Var = this.f127700b;
        if (z13) {
            i1 i1Var = (i1) request;
            if (!i1Var.f127715h) {
                b0Var.getClass();
                b0Var.f127643a = new LinkedHashMap();
                b0Var.f127644b.clear();
                LinkedHashSet linkedHashSet = b0Var.f127645c;
                linkedHashSet.clear();
                b0Var.f127646d.clear();
                b0Var.f127647e = "";
                b0Var.f127648f = "";
                b0Var.f127649g = "";
                b0Var.f127650h = "";
                String str = i1Var.f127708a;
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                b0Var.f127648f = str;
                String str2 = i1Var.f127709b;
                Intrinsics.checkNotNullParameter(str2, "<set-?>");
                b0Var.f127647e = str2;
                String str3 = i1Var.f127710c;
                Intrinsics.checkNotNullParameter(str3, "<set-?>");
                b0Var.f127649g = str3;
                String str4 = i1Var.f127711d;
                Intrinsics.checkNotNullParameter(str4, "<set-?>");
                b0Var.f127650h = str4;
                List list = i1Var.f127712e;
                b0Var.d(list);
                y40 y40Var = i1Var.f127714g;
                if (y40Var != null) {
                    if (y40Var.s() == y40.a.QUIZ) {
                        b0Var.d(list);
                    } else if (y40Var.s() == y40.a.DECISION) {
                        Set decisionPool = i1Var.f127713f;
                        Intrinsics.checkNotNullParameter(decisionPool, "decisionPool");
                        linkedHashSet.addAll(decisionPool);
                    }
                    Intrinsics.checkNotNullParameter(y40Var, "<set-?>");
                    b0Var.f127651i = y40Var;
                }
            }
            b0Var.f127644b.clear();
            b0Var.f127646d.clear();
            if (b0Var.c(0).size() < 2) {
                eventIntake.a(new o(i1Var.f127716i));
                return;
            } else {
                eventIntake.a(new r(0, b0Var.c(0), kotlin.collections.q0.f80391a));
                return;
            }
        }
        if (request instanceof j1) {
            eventIntake.a(new q(b0Var.f127647e, b0Var.f127648f, b0Var.f127649g, b0Var.f127650h, null, b0Var.a(), b0Var.f127645c, false));
            return;
        }
        if (request instanceof t1) {
            t1 t1Var = (t1) request;
            int i13 = t1Var.f127821a;
            b0Var.getClass();
            i50 answer = t1Var.f127822b;
            Intrinsics.checkNotNullParameter(answer, "answer");
            y40.a s13 = b0Var.f127651i.s();
            y40.a aVar = y40.a.DECISION;
            if (s13 == aVar) {
                b0Var.f127646d.add(answer);
            }
            b0Var.f127644b.put(Integer.valueOf(i13), answer);
            int size = (b0Var.f127651i.s() == aVar ? 4 : b0Var.f127643a.size()) - 1;
            int i14 = t1Var.f127821a;
            if (i14 >= size) {
                eventIntake.a(new s(b0Var.f127648f, b0Var.f127649g, b0Var.f127650h, b0Var.b()));
                return;
            }
            int i15 = i14 + 1;
            List c13 = b0Var.c(i15);
            if (c13.size() < 2) {
                eventIntake.a(new o(t1Var.f127823c));
                return;
            } else {
                eventIntake.a(new r(i15, c13, b0Var.b()));
                return;
            }
        }
        if (request instanceof r1) {
            int i16 = ((r1) request).f127794a;
            eventIntake.a(new r(i16, b0Var.c(i16), b0Var.b()));
            return;
        }
        if (request instanceof g1) {
            ko2.f fVar = ao2.v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ko2.e.f80326c, null, new c0(this, null), 2);
            kotlin.jvm.internal.j.z(scope, ho2.q.f69782a, null, new d0(this, null), 2);
        } else if (request instanceof h1) {
            ko2.f fVar2 = ao2.v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ho2.q.f69782a, null, new e0(this, request, null), 2);
        } else if (request instanceof k1) {
            ko2.f fVar3 = ao2.v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ho2.q.f69782a, null, new f0(this, request, null), 2);
        } else if (request instanceof f1) {
            ko2.f fVar4 = ao2.v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ho2.q.f69782a, null, new g0(this, request, null), 2);
        }
    }
}
