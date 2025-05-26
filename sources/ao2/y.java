package ao2;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20233a;

    /* renamed from: b, reason: collision with root package name */
    public final l f20234b;

    /* renamed from: c, reason: collision with root package name */
    public final kl2.l f20235c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20236d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f20237e;

    public /* synthetic */ y(Object obj, l lVar, kl2.l lVar2, CancellationException cancellationException, int i13) {
        this(obj, (i13 & 2) != 0 ? null : lVar, (i13 & 4) != 0 ? null : lVar2, (Object) null, (i13 & 16) != 0 ? null : cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static y a(y yVar, l lVar, CancellationException cancellationException, int i13) {
        Object obj = yVar.f20233a;
        if ((i13 & 2) != 0) {
            lVar = yVar.f20234b;
        }
        l lVar2 = lVar;
        kl2.l lVar3 = yVar.f20235c;
        Object obj2 = yVar.f20236d;
        CancellationException cancellationException2 = cancellationException;
        if ((i13 & 16) != 0) {
            cancellationException2 = yVar.f20237e;
        }
        yVar.getClass();
        return new y(obj, lVar2, lVar3, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f20233a, yVar.f20233a) && Intrinsics.d(this.f20234b, yVar.f20234b) && Intrinsics.d(this.f20235c, yVar.f20235c) && Intrinsics.d(this.f20236d, yVar.f20236d) && Intrinsics.d(this.f20237e, yVar.f20237e);
    }

    public final int hashCode() {
        Object obj = this.f20233a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        l lVar = this.f20234b;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        kl2.l lVar2 = this.f20235c;
        int hashCode3 = (hashCode2 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        Object obj2 = this.f20236d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th3 = this.f20237e;
        return hashCode4 + (th3 != null ? th3.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f20233a + ", cancelHandler=" + this.f20234b + ", onCancellation=" + this.f20235c + ", idempotentResume=" + this.f20236d + ", cancelCause=" + this.f20237e + ')';
    }

    public y(Object obj, l lVar, kl2.l lVar2, Object obj2, Throwable th3) {
        this.f20233a = obj;
        this.f20234b = lVar;
        this.f20235c = lVar2;
        this.f20236d = obj2;
        this.f20237e = th3;
    }
}
