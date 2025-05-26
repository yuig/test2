package bb;

import android.os.Build;

/* loaded from: classes3.dex */
public class b extends c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, String str2, int i13) {
        super(str, str2);
        this.f22444d = i13;
    }

    @Override // bb.c
    public final boolean a() {
        switch (this.f22444d) {
            case 0:
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                if (Build.VERSION.SDK_INT >= 27) {
                    break;
                }
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 28) {
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 29) {
                    break;
                }
                break;
        }
        return true;
    }
}
