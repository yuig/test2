package ac;

import android.content.Context;
import ao2.j0;
import i2.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class w extends dl2.j implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ q1 B;

    /* renamed from: r, reason: collision with root package name */
    public Throwable f1896r;

    /* renamed from: s, reason: collision with root package name */
    public int f1897s;

    /* renamed from: t, reason: collision with root package name */
    public int f1898t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kl2.l f1899u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f1900v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f1901w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f1902x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f1903y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f1904z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kl2.l lVar, Context context, r rVar, String str, String str2, String str3, String str4, q1 q1Var, bl2.c cVar) {
        super(2, cVar);
        this.f1899u = lVar;
        this.f1900v = context;
        this.f1901w = rVar;
        this.f1902x = str;
        this.f1903y = str2;
        this.f1904z = str3;
        this.A = str4;
        this.B = q1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new w(this.f1899u, this.f1900v, this.f1901w, this.f1902x, this.f1903y, this.f1904z, this.A, this.B, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (((java.lang.Boolean) r15).booleanValue() == false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[Catch: all -> 0x0017, TryCatch #1 {all -> 0x0017, blocks: (B:7:0x0012, B:8:0x00cb, B:9:0x00d5, B:13:0x00e9, B:23:0x0067, B:25:0x0071, B:28:0x0078, B:31:0x0087, B:33:0x008b, B:36:0x0092, B:39:0x00a2, B:43:0x00ba, B:46:0x00ab, B:48:0x00b5, B:49:0x0099, B:51:0x007f, B:70:0x00f6, B:74:0x00fa, B:75:0x00fb, B:11:0x00d6, B:69:0x00ec), top: B:6:0x0012, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099 A[Catch: all -> 0x0017, TryCatch #1 {all -> 0x0017, blocks: (B:7:0x0012, B:8:0x00cb, B:9:0x00d5, B:13:0x00e9, B:23:0x0067, B:25:0x0071, B:28:0x0078, B:31:0x0087, B:33:0x008b, B:36:0x0092, B:39:0x00a2, B:43:0x00ba, B:46:0x00ab, B:48:0x00b5, B:49:0x0099, B:51:0x007f, B:70:0x00f6, B:74:0x00fa, B:75:0x00fb, B:11:0x00d6, B:69:0x00ec), top: B:6:0x0012, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c8 -> B:8:0x00cb). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
