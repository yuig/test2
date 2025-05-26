package kv0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.md;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.st;
import dl1.v0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f80923j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f80924k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f80925l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f80926m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f80927n = new a(5);

    /* renamed from: o, reason: collision with root package name */
    public static final a f80928o = new a(6);

    /* renamed from: p, reason: collision with root package name */
    public static final a f80929p = new a(7);

    /* renamed from: q, reason: collision with root package name */
    public static final a f80930q = new a(8);

    /* renamed from: r, reason: collision with root package name */
    public static final a f80931r = new a(9);

    /* renamed from: s, reason: collision with root package name */
    public static final a f80932s = new a(10);

    /* renamed from: t, reason: collision with root package name */
    public static final a f80933t = new a(11);

    /* renamed from: u, reason: collision with root package name */
    public static final a f80934u = new a(12);

    /* renamed from: v, reason: collision with root package name */
    public static final a f80935v = new a(13);

    /* renamed from: w, reason: collision with root package name */
    public static final a f80936w = new a(14);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80937i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f80937i = i13;
    }

    public final Boolean b(st it) {
        switch (this.f80937i) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.s() != null);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.s() != null);
        }
    }

    public final Iterable e(List block) {
        switch (this.f80937i) {
            case 1:
                Intrinsics.checkNotNullParameter(block, "block");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(block, "block");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(block, "tag");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(block, "items");
                break;
            default:
                Intrinsics.checkNotNullParameter(block, "tag");
                break;
        }
        return block;
    }

    public final List f(f30 it) {
        switch (this.f80937i) {
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                md O3 = it.O3();
                List m13 = O3 != null ? O3.m() : null;
                return m13 == null ? new ArrayList() : m13;
            default:
                Intrinsics.checkNotNullParameter(it, "pin");
                return f0.j(new z(), it);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f80937i) {
            case 0:
                ln0 it = (ln0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                List D = it.D();
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : D) {
                    if (hashSet.add(((mq) obj2).getPinId())) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 1:
                return e((List) obj);
            case 2:
                v0 it2 = (v0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return (ln0) it2.f55290b;
            case 3:
                Throwable error = (Throwable) obj;
                Intrinsics.checkNotNullParameter(error, "error");
                return Unit.f80348a;
            case 4:
                Intrinsics.checkNotNullParameter((ln0) obj, "it");
                return Unit.f80348a;
            case 5:
                return e((List) obj);
            case 6:
                return e((List) obj);
            case 7:
                return b((st) obj);
            case 8:
                return f((f30) obj);
            case 9:
                return e((List) obj);
            case 10:
                return b((st) obj);
            case 11:
                f30 it3 = (f30) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return new x(it3, true);
            case 12:
                aq.j editablePin = (aq.j) obj;
                Intrinsics.checkNotNullParameter(editablePin, "editablePin");
                List r13 = editablePin.r();
                if (r13 == null) {
                    r13 = q0.f80391a;
                }
                List H = editablePin.H();
                if (H == null) {
                    H = q0.f80391a;
                }
                List<String> list = r13;
                Intrinsics.checkNotNullParameter(new k(list), "<this>");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str : list) {
                    Object obj3 = linkedHashMap.get(str);
                    if (obj3 == null && !linkedHashMap.containsKey(str)) {
                        obj3 = new h0();
                    }
                    h0 h0Var = (h0) obj3;
                    h0Var.f80426a++;
                    linkedHashMap.put(str, h0Var);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Intrinsics.g(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
                    if ((entry instanceof ll2.a) && !(entry instanceof ll2.d)) {
                        dl2.b.N2(entry, "kotlin.collections.MutableMap.MutableEntry");
                        throw null;
                    }
                    entry.setValue(Integer.valueOf(((h0) entry.getValue()).f80426a));
                }
                Map u13 = dl2.b.u(linkedHashMap);
                List<String> M = CollectionsKt.M(list);
                ArrayList arrayList2 = new ArrayList(g0.q(M, 10));
                for (String str2 : M) {
                    Integer num = (Integer) u13.get(str2);
                    boolean z13 = false;
                    int intValue = num != null ? num.intValue() : 0;
                    if (H.contains(str2) && intValue == 1) {
                        z13 = true;
                    }
                    arrayList2.add(new y(str2, z13));
                }
                return arrayList2;
            case 13:
                return e((List) obj);
            default:
                return f((f30) obj);
        }
    }
}
