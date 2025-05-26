package r0;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f105642b;

    public /* synthetic */ s(int i13, int i14) {
        this.f105641a = i14;
        this.f105642b = i13;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i13 = this.f105641a;
        int i14 = this.f105642b;
        switch (i13) {
            case 0:
                return Math.abs(k0.c.a((Size) obj) - i14) - Math.abs(k0.c.a((Size) obj2) - i14);
            default:
                int abs = Math.abs(((Integer) obj).intValue() - i14) - Math.abs(((Integer) obj2).intValue() - i14);
                return (int) (abs == 0 ? Math.signum(r4.intValue() - r5.intValue()) : Math.signum(abs));
        }
    }
}
