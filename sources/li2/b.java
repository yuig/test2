package li2;

import io.embrace.android.embracesdk.internal.comms.api.ApiRequest;
import java.util.Comparator;
import ki2.c;
import ki2.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kotlin.text.z;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f83583a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f83584b;

    /* JADX WARN: Type inference failed for: r0v0, types: [li2.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [li2.a] */
    static {
        final int i13 = 1;
        f83583a = new Comparator() { // from class: li2.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Runnable lhs = (Runnable) obj;
                Runnable rhs = (Runnable) obj2;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(lhs, "lhs");
                        Intrinsics.checkNotNullParameter(rhs, "rhs");
                        if (!(lhs instanceof c) || !(rhs instanceof c)) {
                            throw new IllegalArgumentException("Runnables must be PriorityRunnableFuture".toString());
                        }
                        c cVar = (c) lhs;
                        Object obj3 = cVar.f79808b;
                        if (obj3 instanceof ApiRequest) {
                            Object obj4 = ((c) rhs).f79808b;
                            if (obj4 instanceof ApiRequest) {
                                if (obj3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type io.embrace.android.embracesdk.internal.comms.api.ApiRequest");
                                }
                                ApiRequest apiRequest = (ApiRequest) obj3;
                                if (obj4 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type io.embrace.android.embracesdk.internal.comms.api.ApiRequest");
                                }
                                ApiRequest apiRequest2 = (ApiRequest) obj4;
                                Intrinsics.checkNotNullParameter(apiRequest, "<this>");
                                if (z.h(apiRequest.f72930h.f72939a, "spans", false)) {
                                    return -1;
                                }
                                Intrinsics.checkNotNullParameter(apiRequest2, "<this>");
                                return z.h(apiRequest2.f72930h.f72939a, "spans", false) ? 1 : 0;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder("PriorityInfo must be of type ApiRequest, got ");
                        Class<?> cls = cVar.f79808b.getClass();
                        l0 l0Var = k0.f80436a;
                        sb3.append(l0Var.b(cls));
                        sb3.append(" and ");
                        sb3.append(l0Var.b(((c) rhs).f79808b.getClass()));
                        throw new IllegalArgumentException(sb3.toString().toString());
                    default:
                        Intrinsics.checkNotNullParameter(lhs, "lhs");
                        Intrinsics.checkNotNullParameter(rhs, "rhs");
                        if (!(lhs instanceof c) || !(rhs instanceof c)) {
                            throw new IllegalArgumentException("Runnables must be PriorityRunnableFuture".toString());
                        }
                        c cVar2 = (c) lhs;
                        Object obj5 = cVar2.f79808b;
                        if (obj5 instanceof f) {
                            Object obj6 = ((c) rhs).f79808b;
                            if (obj6 instanceof f) {
                                if (obj5 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type io.embrace.android.embracesdk.internal.worker.TaskPriority");
                                }
                                f fVar = (f) obj5;
                                if (obj6 != null) {
                                    return fVar.compareTo((f) obj6);
                                }
                                throw new NullPointerException("null cannot be cast to non-null type io.embrace.android.embracesdk.internal.worker.TaskPriority");
                            }
                        }
                        StringBuilder sb4 = new StringBuilder("PriorityInfo must be of type ");
                        sb4.append(f.class.getSimpleName());
                        sb4.append(", got ");
                        Class<?> cls2 = cVar2.f79808b.getClass();
                        l0 l0Var2 = k0.f80436a;
                        sb4.append(l0Var2.b(cls2));
                        sb4.append(" and ");
                        sb4.append(l0Var2.b(((c) rhs).f79808b.getClass()));
                        throw new IllegalArgumentException(sb4.toString().toString());
                }
            }
        };
        final int i14 = 0;
        f83584b = new Comparator() { // from class: li2.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Runnable lhs = (Runnable) obj;
                Runnable rhs = (Runnable) obj2;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(lhs, "lhs");
                        Intrinsics.checkNotNullParameter(rhs, "rhs");
                        if (!(lhs instanceof c) || !(rhs instanceof c)) {
                            throw new IllegalArgumentException("Runnables must be PriorityRunnableFuture".toString());
                        }
                        c cVar = (c) lhs;
                        Object obj3 = cVar.f79808b;
                        if (obj3 instanceof ApiRequest) {
                            Object obj4 = ((c) rhs).f79808b;
                            if (obj4 instanceof ApiRequest) {
                                if (obj3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type io.embrace.android.embracesdk.internal.comms.api.ApiRequest");
                                }
                                ApiRequest apiRequest = (ApiRequest) obj3;
                                if (obj4 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type io.embrace.android.embracesdk.internal.comms.api.ApiRequest");
                                }
                                ApiRequest apiRequest2 = (ApiRequest) obj4;
                                Intrinsics.checkNotNullParameter(apiRequest, "<this>");
                                if (z.h(apiRequest.f72930h.f72939a, "spans", false)) {
                                    return -1;
                                }
                                Intrinsics.checkNotNullParameter(apiRequest2, "<this>");
                                return z.h(apiRequest2.f72930h.f72939a, "spans", false) ? 1 : 0;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder("PriorityInfo must be of type ApiRequest, got ");
                        Class<?> cls = cVar.f79808b.getClass();
                        l0 l0Var = k0.f80436a;
                        sb3.append(l0Var.b(cls));
                        sb3.append(" and ");
                        sb3.append(l0Var.b(((c) rhs).f79808b.getClass()));
                        throw new IllegalArgumentException(sb3.toString().toString());
                    default:
                        Intrinsics.checkNotNullParameter(lhs, "lhs");
                        Intrinsics.checkNotNullParameter(rhs, "rhs");
                        if (!(lhs instanceof c) || !(rhs instanceof c)) {
                            throw new IllegalArgumentException("Runnables must be PriorityRunnableFuture".toString());
                        }
                        c cVar2 = (c) lhs;
                        Object obj5 = cVar2.f79808b;
                        if (obj5 instanceof f) {
                            Object obj6 = ((c) rhs).f79808b;
                            if (obj6 instanceof f) {
                                if (obj5 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type io.embrace.android.embracesdk.internal.worker.TaskPriority");
                                }
                                f fVar = (f) obj5;
                                if (obj6 != null) {
                                    return fVar.compareTo((f) obj6);
                                }
                                throw new NullPointerException("null cannot be cast to non-null type io.embrace.android.embracesdk.internal.worker.TaskPriority");
                            }
                        }
                        StringBuilder sb4 = new StringBuilder("PriorityInfo must be of type ");
                        sb4.append(f.class.getSimpleName());
                        sb4.append(", got ");
                        Class<?> cls2 = cVar2.f79808b.getClass();
                        l0 l0Var2 = k0.f80436a;
                        sb4.append(l0Var2.b(cls2));
                        sb4.append(" and ");
                        sb4.append(l0Var2.b(((c) rhs).f79808b.getClass()));
                        throw new IllegalArgumentException(sb4.toString().toString());
                }
            }
        };
    }
}
