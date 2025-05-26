package q4;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import i2.u0;
import i2.y3;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f102344a = new u0(y3.f71400a, e.f102320k);

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0160, code lost:
    
        if (r6 == r1) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(q4.y r28, kotlin.jvm.functions.Function0 r29, q4.z r30, kotlin.jvm.functions.Function2 r31, i2.o r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.l.a(q4.y, kotlin.jvm.functions.Function0, q4.z, kotlin.jvm.functions.Function2, i2.o, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(u2.e r16, long r17, kotlin.jvm.functions.Function0 r19, q4.z r20, kotlin.jvm.functions.Function2 r21, i2.o r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.l.b(u2.e, long, kotlin.jvm.functions.Function0, q4.z, kotlin.jvm.functions.Function2, i2.o, int, int):void");
    }

    public static final boolean c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
