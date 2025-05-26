package ot1;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final List f97618a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f97619b;

    /* renamed from: c, reason: collision with root package name */
    public final t.a f97620c;

    /* renamed from: d, reason: collision with root package name */
    public final t.a f97621d;

    /* renamed from: e, reason: collision with root package name */
    public final t.a f97622e;

    /* renamed from: f, reason: collision with root package name */
    public final et1.v f97623f;

    /* renamed from: g, reason: collision with root package name */
    public final et1.l f97624g;

    /* renamed from: h, reason: collision with root package name */
    public final t.a f97625h;

    /* renamed from: i, reason: collision with root package name */
    public final t.a f97626i;

    /* renamed from: j, reason: collision with root package name */
    public final t.a f97627j;

    /* renamed from: k, reason: collision with root package name */
    public long f97628k;

    /* renamed from: l, reason: collision with root package name */
    public final nt1.e f97629l;

    /* renamed from: m, reason: collision with root package name */
    public final z0 f97630m;

    /* renamed from: n, reason: collision with root package name */
    public final k0 f97631n;

    /* renamed from: o, reason: collision with root package name */
    public final long f97632o;

    /* renamed from: p, reason: collision with root package name */
    public final long f97633p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f97634q;

    /* renamed from: r, reason: collision with root package name */
    public long f97635r;

    /* JADX WARN: Code restructure failed: missing block: B:208:0x06ee, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0.f97664k, java.lang.Boolean.TRUE) == false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x06f0, code lost:
    
        r2.b(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x06f4, code lost:
    
        r2 = r2.b((int) r0.f97670q);
        r63.f97633p = r5;
        r63.f97628k = r2 + 1;
        r0 = r63.f97630m;
        r63.f97632o = r0.A * r0.B;
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0712, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03aa A[Catch: Exception -> 0x02eb, TryCatch #2 {Exception -> 0x02eb, blocks: (B:76:0x021a, B:79:0x0231, B:82:0x023e, B:85:0x024b, B:88:0x0258, B:91:0x0265, B:94:0x0274, B:122:0x0391, B:124:0x03aa, B:126:0x041b, B:129:0x042a, B:133:0x0445, B:136:0x044e, B:137:0x0457, B:140:0x0462, B:142:0x0468, B:143:0x0486, B:145:0x048c, B:146:0x0497, B:276:0x03c8, B:279:0x03d1, B:281:0x03f9, B:286:0x02d0, B:288:0x02dd, B:291:0x02e6, B:292:0x02f1, B:295:0x0318, B:299:0x0329, B:301:0x033e, B:307:0x0350, B:308:0x035a, B:310:0x036d, B:313:0x0360, B:314:0x036a), top: B:75:0x021a }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0445 A[Catch: Exception -> 0x02eb, TryCatch #2 {Exception -> 0x02eb, blocks: (B:76:0x021a, B:79:0x0231, B:82:0x023e, B:85:0x024b, B:88:0x0258, B:91:0x0265, B:94:0x0274, B:122:0x0391, B:124:0x03aa, B:126:0x041b, B:129:0x042a, B:133:0x0445, B:136:0x044e, B:137:0x0457, B:140:0x0462, B:142:0x0468, B:143:0x0486, B:145:0x048c, B:146:0x0497, B:276:0x03c8, B:279:0x03d1, B:281:0x03f9, B:286:0x02d0, B:288:0x02dd, B:291:0x02e6, B:292:0x02f1, B:295:0x0318, B:299:0x0329, B:301:0x033e, B:307:0x0350, B:308:0x035a, B:310:0x036d, B:313:0x0360, B:314:0x036a), top: B:75:0x021a }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0468 A[Catch: Exception -> 0x02eb, TryCatch #2 {Exception -> 0x02eb, blocks: (B:76:0x021a, B:79:0x0231, B:82:0x023e, B:85:0x024b, B:88:0x0258, B:91:0x0265, B:94:0x0274, B:122:0x0391, B:124:0x03aa, B:126:0x041b, B:129:0x042a, B:133:0x0445, B:136:0x044e, B:137:0x0457, B:140:0x0462, B:142:0x0468, B:143:0x0486, B:145:0x048c, B:146:0x0497, B:276:0x03c8, B:279:0x03d1, B:281:0x03f9, B:286:0x02d0, B:288:0x02dd, B:291:0x02e6, B:292:0x02f1, B:295:0x0318, B:299:0x0329, B:301:0x033e, B:307:0x0350, B:308:0x035a, B:310:0x036d, B:313:0x0360, B:314:0x036a), top: B:75:0x021a }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x048c A[Catch: Exception -> 0x02eb, TryCatch #2 {Exception -> 0x02eb, blocks: (B:76:0x021a, B:79:0x0231, B:82:0x023e, B:85:0x024b, B:88:0x0258, B:91:0x0265, B:94:0x0274, B:122:0x0391, B:124:0x03aa, B:126:0x041b, B:129:0x042a, B:133:0x0445, B:136:0x044e, B:137:0x0457, B:140:0x0462, B:142:0x0468, B:143:0x0486, B:145:0x048c, B:146:0x0497, B:276:0x03c8, B:279:0x03d1, B:281:0x03f9, B:286:0x02d0, B:288:0x02dd, B:291:0x02e6, B:292:0x02f1, B:295:0x0318, B:299:0x0329, B:301:0x033e, B:307:0x0350, B:308:0x035a, B:310:0x036d, B:313:0x0360, B:314:0x036a), top: B:75:0x021a }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04eb A[Catch: Exception -> 0x056a, TryCatch #3 {Exception -> 0x056a, blocks: (B:149:0x04b8, B:152:0x04eb, B:154:0x0501, B:157:0x0514, B:160:0x051f, B:162:0x0528, B:163:0x052d, B:165:0x0532, B:167:0x053b, B:168:0x053f, B:169:0x054c, B:171:0x0559, B:174:0x05d7, B:177:0x05f2, B:180:0x0614, B:183:0x061f, B:186:0x062a, B:233:0x0546, B:234:0x0578, B:237:0x0581, B:240:0x0596, B:242:0x059e, B:246:0x05b8, B:248:0x05c0), top: B:148:0x04b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0559 A[Catch: Exception -> 0x056a, LOOP:3: B:170:0x0557->B:171:0x0559, LOOP_END, TryCatch #3 {Exception -> 0x056a, blocks: (B:149:0x04b8, B:152:0x04eb, B:154:0x0501, B:157:0x0514, B:160:0x051f, B:162:0x0528, B:163:0x052d, B:165:0x0532, B:167:0x053b, B:168:0x053f, B:169:0x054c, B:171:0x0559, B:174:0x05d7, B:177:0x05f2, B:180:0x0614, B:183:0x061f, B:186:0x062a, B:233:0x0546, B:234:0x0578, B:237:0x0581, B:240:0x0596, B:242:0x059e, B:246:0x05b8, B:248:0x05c0), top: B:148:0x04b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0775 A[Catch: Exception -> 0x0773, TryCatch #5 {Exception -> 0x0773, blocks: (B:256:0x074a, B:257:0x0772, B:258:0x0775, B:259:0x0780), top: B:150:0x04e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v(nt1.e r64, java.util.LinkedList r65, byte[] r66, t.a r67, t.a r68, t.a r69, et1.v r70, et1.l r71, t.a r72, t.a r73, t.a r74, ot1.a1 r75, ot1.l0 r76) {
        /*
            Method dump skipped, instructions count: 2196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ot1.v.<init>(nt1.e, java.util.LinkedList, byte[], t.a, t.a, t.a, et1.v, et1.l, t.a, t.a, t.a, ot1.a1, ot1.l0):void");
    }

    public final String a(String str) {
        StringBuilder D = ep.b.D(str, ": ");
        int i13 = 0;
        for (Object obj : this.f97618a) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            D.append("Buffer [" + i13 + "]: [" + pe.i.u((byte[]) obj) + "]");
            i13 = i14;
        }
        D.append("Reference frame [" + pe.i.u(this.f97619b) + "]");
        String sb3 = D.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public final void b() {
        long j13;
        c0 c0Var;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        getClass();
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        e outputStream2 = new e(outputStream);
        getClass();
        Intrinsics.checkNotNullParameter(outputStream2, "outputStream");
        x bitWriter = new x(outputStream2);
        getClass();
        Intrinsics.checkNotNullParameter(bitWriter, "bitWriter");
        j0 multiBitWriter = new j0(bitWriter);
        getClass();
        Intrinsics.checkNotNullParameter(multiBitWriter, "multiBitWriter");
        e0 e0Var = new e0(multiBitWriter);
        multiBitWriter.a(1, 0L);
        multiBitWriter.a(2, this.f97633p);
        long nalUnitId = o.NonIdrWithoutPartitioning.getNalUnitId();
        xk2.d0 d0Var = xk2.e0.f135207b;
        multiBitWriter.a(5, nalUnitId);
        e0Var.b(0L);
        e0Var.b(y0.P.ordinal());
        k0 k0Var = this.f97631n;
        e0Var.b(k0Var.f97586a);
        z0 z0Var = this.f97630m;
        int i13 = (int) z0Var.f97670q;
        multiBitWriter.a(i13, this.f97628k & ((1 << i13) - 1));
        long j14 = z0Var.f97671r;
        boolean z13 = k0Var.f97589d;
        if (j14 == 0) {
            xk2.e0 e0Var2 = z0Var.f97672s;
            Integer valueOf = e0Var2 != null ? Integer.valueOf((int) e0Var2.f135208a) : null;
            Intrinsics.f(valueOf);
            multiBitWriter.a(valueOf.intValue(), 1L);
            if (z13) {
                e0Var.a(0L);
            }
        } else if (j14 == 1) {
            if (Intrinsics.d(z0Var.f97673t, Boolean.FALSE)) {
                e0Var.a(1L);
                if (z13) {
                    e0Var.a(0L);
                }
            }
        }
        if (k0Var.f97604s) {
            e0Var.b(0L);
        }
        bitWriter.a(0);
        bitWriter.a(0);
        bitWriter.a(0);
        e0Var.a(0L);
        if (k0Var.f97602q) {
            j13 = 1;
            e0Var.b(1L);
        } else {
            j13 = 1;
        }
        if (Long.compareUnsigned(k0Var.f97590e, j13) > 0 && (c0Var = k0Var.f97593h) != null) {
            multiBitWriter.a(pp2.a.F0(Long.divideUnsigned(z0Var.H, c0Var.f97544b) + j13), ml2.c.d((float) Math.ceil(((float) c3.r0(r11)) / ((float) c3.r0(r8)))));
        }
        e0Var.b(this.f97632o);
        bitWriter.a(1);
        while (bitWriter.f97642b != 7) {
            bitWriter.a(0);
        }
        int size = outputStream.size() + 4;
        if (size > this.f97634q.capacity()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(size);
            Intrinsics.checkNotNullExpressionValue(allocateDirect, "allocateDirect(...)");
            this.f97634q = allocateDirect;
        }
        byte[] byteArray = outputStream.toByteArray();
        this.f97634q.clear();
        this.f97634q.put(g.f97572b);
        this.f97634q.put(byteArray);
        this.f97634q.flip();
        outputStream.reset();
        this.f97634q.remaining();
        float r03 = (float) c3.r0(this.f97628k);
        nt1.e toClockPeriod = nt1.d.f92294a;
        nt1.e fromClockPeriod = this.f97629l;
        Intrinsics.checkNotNullParameter(fromClockPeriod, "fromClockPeriod");
        Intrinsics.checkNotNullParameter(toClockPeriod, "toClockPeriod");
        float a13 = (fromClockPeriod.a() * r03) / toClockPeriod.a();
        if (a13 >= -9.223372E18f && a13 <= 9.223372E18f) {
            this.f97635r = ml2.c.d(a13);
            this.f97628k++;
        } else {
            throw new IllegalArgumentException(a("Timestamp [" + a13 + "] is out of range of a signed 64-bit integer").toString());
        }
    }
}
