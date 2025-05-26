package h72;

import ao2.j0;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public File f67964r;

    /* renamed from: s, reason: collision with root package name */
    public int f67965s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f67966t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f67966t = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f67966t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0090 A[Catch: Exception -> 0x0094, TryCatch #1 {Exception -> 0x0094, blocks: (B:12:0x0076, B:14:0x0090, B:15:0x0096), top: B:11:0x0076, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:8:0x0013, B:9:0x006d, B:16:0x00a2, B:22:0x009a, B:26:0x0024, B:27:0x004a, B:29:0x0052, B:30:0x0055, B:32:0x005b, B:34:0x005e, B:38:0x0028, B:39:0x003a, B:43:0x002f, B:12:0x0076, B:14:0x0090, B:15:0x0096), top: B:2:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:8:0x0013, B:9:0x006d, B:16:0x00a2, B:22:0x009a, B:26:0x0024, B:27:0x004a, B:29:0x0052, B:30:0x0055, B:32:0x005b, B:34:0x005e, B:38:0x0028, B:39:0x003a, B:43:0x002f, B:12:0x0076, B:14:0x0090, B:15:0x0096), top: B:2:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:8:0x0013, B:9:0x006d, B:16:0x00a2, B:22:0x009a, B:26:0x0024, B:27:0x004a, B:29:0x0052, B:30:0x0055, B:32:0x005b, B:34:0x005e, B:38:0x0028, B:39:0x003a, B:43:0x002f, B:12:0x0076, B:14:0x0090, B:15:0x0096), top: B:2:0x0009, inners: #1 }] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r7.f67965s
            r2 = 3
            r3 = 2
            r4 = 1
            h72.l r5 = r7.f67966t
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L28
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.io.File r0 = r7.f67964r
            ue.c.H(r8)     // Catch: java.lang.Exception -> L17
            goto L6d
        L17:
            r8 = move-exception
            goto La7
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L22:
            java.io.File r1 = r7.f67964r
            ue.c.H(r8)     // Catch: java.lang.Exception -> L17
            goto L4a
        L28:
            ue.c.H(r8)     // Catch: java.lang.Exception -> L17
            goto L3a
        L2c:
            ue.c.H(r8)
            r7.f67965s = r4     // Catch: java.lang.Exception -> L17
            ao2.q0 r8 = r5.f67994i     // Catch: java.lang.Exception -> L17
            java.lang.Object r8 = r8.v(r7)     // Catch: java.lang.Exception -> L17
            if (r8 != r0) goto L3a
            return r0
        L3a:
            r1 = r8
            java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Exception -> L17
            r7.f67964r = r1     // Catch: java.lang.Exception -> L17
            r7.f67965s = r3     // Catch: java.lang.Exception -> L17
            ao2.q0 r8 = r5.f67995j     // Catch: java.lang.Exception -> L17
            java.lang.Object r8 = r8.v(r7)     // Catch: java.lang.Exception -> L17
            if (r8 != r0) goto L4a
            return r0
        L4a:
            java.io.File r8 = (java.io.File) r8     // Catch: java.lang.Exception -> L17
            boolean r3 = r1.exists()     // Catch: java.lang.Exception -> L17
            if (r3 != 0) goto L55
            r1.mkdir()     // Catch: java.lang.Exception -> L17
        L55:
            boolean r1 = r8.exists()     // Catch: java.lang.Exception -> L17
            if (r1 == 0) goto L5e
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L17
            return r8
        L5e:
            k72.d r1 = r5.f67988c     // Catch: java.lang.Exception -> L17
            r7.f67964r = r8     // Catch: java.lang.Exception -> L17
            r7.f67965s = r2     // Catch: java.lang.Exception -> L17
            java.lang.Object r1 = r1.a(r7)     // Catch: java.lang.Exception -> L17
            if (r1 != r0) goto L6b
            return r0
        L6b:
            r0 = r8
            r8 = r1
        L6d:
            d72.c r8 = (d72.c) r8     // Catch: java.lang.Exception -> L17
            java.lang.Object r8 = r8.f53913c     // Catch: java.lang.Exception -> L17
            f72.x0 r8 = (f72.x0) r8     // Catch: java.lang.Exception -> L17
            java.util.List r8 = r8.f61410b     // Catch: java.lang.Exception -> L17
            r1 = 0
            ro2.b r2 = ro2.c.f108975d     // Catch: java.lang.Exception -> L94
            r2.getClass()     // Catch: java.lang.Exception -> L94
            qo2.d r3 = new qo2.d     // Catch: java.lang.Exception -> L94
            f72.z r6 = f72.a0.Companion     // Catch: java.lang.Exception -> L94
            no2.b r6 = r6.serializer()     // Catch: java.lang.Exception -> L94
            r3.<init>(r6, r1)     // Catch: java.lang.Exception -> L94
            java.lang.String r8 = r2.b(r3, r8)     // Catch: java.lang.Exception -> L94
            boolean r2 = r0.exists()     // Catch: java.lang.Exception -> L94
            if (r2 != 0) goto L96
            r0.createNewFile()     // Catch: java.lang.Exception -> L94
            goto L96
        L94:
            r8 = move-exception
            goto L9a
        L96:
            il2.k.d(r0, r8)     // Catch: java.lang.Exception -> L94
            goto La2
        L9a:
            n72.m r0 = r5.f67992g     // Catch: java.lang.Exception -> L17
            h72.d r2 = h72.d.f67956j     // Catch: java.lang.Exception -> L17
            r0.d(r8, r2)     // Catch: java.lang.Exception -> L17
            r4 = r1
        La2:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L17
            return r8
        La7:
            n72.m r0 = r5.f67992g
            h72.d r1 = h72.d.f67957k
            r0.d(r8, r1)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h72.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
