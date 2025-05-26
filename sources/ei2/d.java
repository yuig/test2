package ei2;

import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import io.embrace.android.embracesdk.internal.config.instrumented.OtelLimitsConfigExtKt;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig;
import io.opentelemetry.api.trace.StatusCode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.g1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f58969a = g1.b(sj2.b.f113029b.f108404b);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        if (r1 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String a(java.lang.String r5, java.util.List r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
            r1 = 0
            r2 = r0
        L13:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r6.next()
            r4 = r3
            io.embrace.android.embracesdk.internal.payload.Attribute r4 = (io.embrace.android.embracesdk.internal.payload.Attribute) r4
            java.lang.String r4 = r4.f73101a
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r5)
            if (r4 == 0) goto L13
            if (r1 == 0) goto L2c
        L2a:
            r2 = r0
            goto L32
        L2c:
            r1 = 1
            r2 = r3
            goto L13
        L2f:
            if (r1 != 0) goto L32
            goto L2a
        L32:
            io.embrace.android.embracesdk.internal.payload.Attribute r2 = (io.embrace.android.embracesdk.internal.payload.Attribute) r2
            if (r2 == 0) goto L38
            java.lang.String r0 = r2.f73102b
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ei2.d.a(java.lang.String, java.util.List):java.lang.String");
    }

    public static void b(qi2.b bVar, Map attributes, boolean z13) {
        OtelLimitsConfig limits = InstrumentedConfigImpl.INSTANCE.getOtelLimits();
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(limits, "limits");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : attributes.entrySet()) {
            if (!OtelLimitsConfigExtKt.isAttributeValid(limits, (String) entry.getKey(), (String) entry.getValue(), z13)) {
                if (f58969a.contains((String) entry.getKey())) {
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            bVar.b(ri2.e.a(qi2.c.STRING, str), (String) entry2.getValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r2 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(io.embrace.android.embracesdk.internal.payload.Span r7, xf2.h r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "fixedAttribute"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = r8.f134852b
            java.util.List r7 = r7.f73248i
            r1 = 0
            if (r7 == 0) goto L42
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r2 = 0
            r3 = r1
        L19:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r4 = r7.next()
            r5 = r4
            io.embrace.android.embracesdk.internal.payload.Attribute r5 = (io.embrace.android.embracesdk.internal.payload.Attribute) r5
            java.lang.String r5 = r5.f73101a
            xf2.d0 r6 = r8.f134851a
            java.lang.String r6 = r6.f134855a
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r6)
            if (r5 == 0) goto L19
            if (r2 == 0) goto L36
        L34:
            r3 = r1
            goto L3c
        L36:
            r2 = 1
            r3 = r4
            goto L19
        L39:
            if (r2 != 0) goto L3c
            goto L34
        L3c:
            io.embrace.android.embracesdk.internal.payload.Attribute r3 = (io.embrace.android.embracesdk.internal.payload.Attribute) r3
            if (r3 == 0) goto L42
            java.lang.String r1 = r3.f73102b
        L42:
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ei2.d.c(io.embrace.android.embracesdk.internal.payload.Span, xf2.h):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r2 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean d(io.embrace.android.embracesdk.internal.payload.SpanEvent r7, xf2.c0 r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "fixedAttribute"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = r8.f134852b
            java.util.List r7 = r7.f73251c
            r1 = 0
            if (r7 == 0) goto L42
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r2 = 0
            r3 = r1
        L19:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r4 = r7.next()
            r5 = r4
            io.embrace.android.embracesdk.internal.payload.Attribute r5 = (io.embrace.android.embracesdk.internal.payload.Attribute) r5
            java.lang.String r5 = r5.f73101a
            xf2.d0 r6 = r8.f134851a
            java.lang.String r6 = r6.f134855a
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r6)
            if (r5 == 0) goto L19
            if (r2 == 0) goto L36
        L34:
            r3 = r1
            goto L3c
        L36:
            r2 = 1
            r3 = r4
            goto L19
        L39:
            if (r2 != 0) goto L3c
            goto L34
        L3c:
            io.embrace.android.embracesdk.internal.payload.Attribute r3 = (io.embrace.android.embracesdk.internal.payload.Attribute) r3
            if (r3 == 0) goto L42
            java.lang.String r1 = r3.f73102b
        L42:
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ei2.d.d(io.embrace.android.embracesdk.internal.payload.SpanEvent, xf2.c0):boolean");
    }

    public static final th2.m e(StatusCode statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "<this>");
        int i13 = c.f58968a[statusCode.ordinal()];
        if (i13 == 1) {
            return th2.m.UNSET;
        }
        if (i13 == 2) {
            return th2.m.OK;
        }
        if (i13 == 3) {
            return th2.m.ERROR;
        }
        throw new NoWhenBranchMatchedException();
    }
}
