package c71;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f26774j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f26775k = new l(1);

    /* renamed from: l, reason: collision with root package name */
    public static final l f26776l = new l(2);

    /* renamed from: m, reason: collision with root package name */
    public static final l f26777m = new l(3);

    /* renamed from: n, reason: collision with root package name */
    public static final l f26778n = new l(4);

    /* renamed from: o, reason: collision with root package name */
    public static final l f26779o = new l(5);

    /* renamed from: p, reason: collision with root package name */
    public static final l f26780p = new l(6);

    /* renamed from: q, reason: collision with root package name */
    public static final l f26781q = new l(7);

    /* renamed from: r, reason: collision with root package name */
    public static final l f26782r = new l(8);

    /* renamed from: s, reason: collision with root package name */
    public static final l f26783s = new l(9);

    /* renamed from: t, reason: collision with root package name */
    public static final l f26784t = new l(10);

    /* renamed from: u, reason: collision with root package name */
    public static final l f26785u = new l(11);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26786i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(1);
        this.f26786i = i13;
    }

    public final Boolean b(List it) {
        switch (this.f26786i) {
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return Boolean.valueOf(!it.isEmpty());
    }

    public final String e(e50.q node) {
        String str;
        e50.u uVar;
        switch (this.f26786i) {
            case 1:
                Intrinsics.checkNotNullParameter(node, "node");
                Intrinsics.checkNotNullParameter(node, "<this>");
                e50.z zVar = node instanceof e50.z ? (e50.z) node : null;
                return (zVar == null || (str = zVar.f57462c) == null) ? String.valueOf(node.hashCode()) : str;
            default:
                Intrinsics.checkNotNullParameter(node, "node");
                Intrinsics.checkNotNullParameter(node, "<this>");
                e50.v vVar = node instanceof e50.v ? (e50.v) node : null;
                if (vVar == null || (uVar = vVar.f57434e) == null) {
                    return null;
                }
                return uVar.f57428a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        if (r2 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
    
        if (r3 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c5, code lost:
    
        if (r4 != null) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c71.l.invoke(java.lang.Object):java.lang.Object");
    }
}
