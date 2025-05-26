package so2;

import kh2.j1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonEncodingException;
import qo2.s0;

/* loaded from: classes4.dex */
public abstract class c extends s0 implements ro2.t {

    /* renamed from: b, reason: collision with root package name */
    public final ro2.c f114761b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f114762c;

    /* renamed from: d, reason: collision with root package name */
    public final ro2.k f114763d;

    /* renamed from: e, reason: collision with root package name */
    public String f114764e;

    public c(ro2.c cVar, Function1 function1) {
        this.f114761b = cVar;
        this.f114762c = function1;
        this.f114763d = cVar.f108976a;
    }

    @Override // qo2.s0
    public final void G(Object obj, double d2) {
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "tag");
        M(key, ro2.o.a(Double.valueOf(d2)));
        if (this.f114763d.f109022k) {
            return;
        }
        if (Double.isInfinite(d2) || Double.isNaN(d2)) {
            Double value = Double.valueOf(d2);
            String output = L().toString();
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(output, "output");
            throw new JsonEncodingException(j1.L1(value, key, output));
        }
    }

    @Override // qo2.s0
    public final void H(float f13, Object obj) {
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "tag");
        M(key, ro2.o.a(Float.valueOf(f13)));
        if (this.f114763d.f109022k) {
            return;
        }
        if (Float.isInfinite(f13) || Float.isNaN(f13)) {
            Float value = Float.valueOf(f13);
            String output = L().toString();
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(output, "output");
            throw new JsonEncodingException(j1.L1(value, key, output));
        }
    }

    @Override // qo2.s0
    public final po2.d I(Object obj, oo2.g inlineDescriptor) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (f0.a(inlineDescriptor)) {
            return new b(this, tag);
        }
        Intrinsics.checkNotNullParameter(inlineDescriptor, "<this>");
        if (inlineDescriptor.isInline() && Intrinsics.d(inlineDescriptor, ro2.o.f109027a)) {
            return new b(this, tag, inlineDescriptor);
        }
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        this.f104620a.add(tag);
        return this;
    }

    public abstract ro2.n L();

    public abstract void M(String str, ro2.n nVar);

    @Override // po2.d
    public final po2.b b(oo2.g descriptor) {
        q qVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Function1 nodeConsumer = CollectionsKt.d0(this.f104620a) == null ? this.f114762c : new cd2.n(this, 22);
        oo2.n c13 = descriptor.c();
        boolean d2 = Intrinsics.d(c13, oo2.o.f96904b);
        ro2.c json = this.f114761b;
        if (d2 || (c13 instanceof oo2.d)) {
            qVar = new q(json, nodeConsumer, 2);
        } else if (Intrinsics.d(c13, oo2.o.f96905c)) {
            oo2.g r13 = f0.h.r(descriptor.h(0), json.f108977b);
            oo2.n c14 = r13.c();
            if ((c14 instanceof oo2.f) || Intrinsics.d(c14, oo2.m.f96902a)) {
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
                v vVar = new v(json, nodeConsumer, 1);
                vVar.f114824i = true;
                qVar = vVar;
            } else {
                if (!json.f108976a.f109015d) {
                    throw j1.g(r13);
                }
                qVar = new q(json, nodeConsumer, 2);
            }
        } else {
            qVar = new q(json, nodeConsumer, 1);
        }
        String str = this.f114764e;
        if (str != null) {
            qVar.M(str, ro2.o.b(descriptor.i()));
            this.f114764e = null;
        }
        return qVar;
    }

    @Override // po2.d
    public final to2.d c() {
        return this.f114761b.f108977b;
    }

    @Override // ro2.t
    public final ro2.c d() {
        return this.f114761b;
    }

    @Override // ro2.t
    public final void e(ro2.n element) {
        Intrinsics.checkNotNullParameter(element, "element");
        k(ro2.r.f109037a, element);
    }

    @Override // po2.b
    public final boolean j(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.f114763d.f109012a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r0.f109026o != ro2.a.NONE) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0, oo2.o.f96906d) == false) goto L30;
     */
    @Override // qo2.s0, po2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(no2.h r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.ArrayList r0 = r4.f104620a
            java.lang.Object r0 = kotlin.collections.CollectionsKt.d0(r0)
            ro2.c r1 = r4.f114761b
            if (r0 != 0) goto L36
            oo2.g r0 = r5.a()
            to2.d r2 = r1.f108977b
            oo2.g r0 = f0.h.r(r0, r2)
            oo2.n r2 = r0.c()
            boolean r2 = r2 instanceof oo2.f
            if (r2 != 0) goto L29
            oo2.n r0 = r0.c()
            oo2.m r2 = oo2.m.f96902a
            if (r0 != r2) goto L36
        L29:
            so2.q r0 = new so2.q
            kotlin.jvm.functions.Function1 r2 = r4.f114762c
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0.k(r5, r6)
            goto Lcc
        L36:
            ro2.k r0 = r1.f108976a
            boolean r2 = r0.f109020i
            if (r2 == 0) goto L41
            r5.c(r4, r6)
            goto Lcc
        L41:
            boolean r2 = r5 instanceof qo2.b
            if (r2 == 0) goto L4c
            ro2.a r0 = r0.f109026o
            ro2.a r3 = ro2.a.NONE
            if (r0 == r3) goto L86
            goto L77
        L4c:
            ro2.a r0 = r0.f109026o
            int[] r3 = so2.z.f114839a
            int r0 = r0.ordinal()
            r0 = r3[r0]
            r3 = 1
            if (r0 == r3) goto L86
            r3 = 2
            if (r0 == r3) goto L86
            r3 = 3
            if (r0 != r3) goto L80
            oo2.g r0 = r5.a()
            oo2.n r0 = r0.c()
            oo2.o r3 = oo2.o.f96903a
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r0, r3)
            if (r3 != 0) goto L77
            oo2.o r3 = oo2.o.f96906d
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r3)
            if (r0 == 0) goto L86
        L77:
            oo2.g r0 = r5.a()
            java.lang.String r0 = kh2.r.w(r0, r1)
            goto L87
        L80:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L86:
            r0 = 0
        L87:
            if (r2 == 0) goto Lc5
            r1 = r5
            qo2.b r1 = (qo2.b) r1
            if (r6 == 0) goto La4
            no2.h r1 = kh2.r.G(r1, r4, r6)
            if (r0 == 0) goto L97
            kh2.r.i(r5, r1, r0)
        L97:
            oo2.g r5 = r1.a()
            oo2.n r5 = r5.c()
            kh2.r.v(r5)
            r5 = r1
            goto Lc5
        La4:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Value for serializer "
            r6.<init>(r0)
            oo2.g r5 = r5.a()
            r6.append(r5)
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        Lc5:
            if (r0 == 0) goto Lc9
            r4.f114764e = r0
        Lc9:
            r5.c(r4, r6)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.c.k(no2.h, java.lang.Object):void");
    }

    @Override // po2.d
    public final po2.d l(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (CollectionsKt.d0(this.f104620a) != null) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return I(K(), descriptor);
        }
        return new q(this.f114761b, this.f114762c, 0).l(descriptor);
    }

    @Override // po2.d
    public final void s() {
        String tag = (String) CollectionsKt.d0(this.f104620a);
        if (tag == null) {
            this.f114762c.invoke(ro2.z.INSTANCE);
        } else {
            Intrinsics.checkNotNullParameter(tag, "tag");
            M(tag, ro2.z.INSTANCE);
        }
    }
}
