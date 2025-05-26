package s52;

import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111187i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ xk2.k f111188j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(xk2.k kVar, int i13) {
        super(0);
        this.f111187i = i13;
        this.f111188j = kVar;
    }

    public final t1 b() {
        int i13 = this.f111187i;
        xk2.k kVar = this.f111188j;
        switch (i13) {
        }
        return ((u1) kVar.getValue()).getViewModelStore();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f111187i;
        xk2.k kVar = this.f111188j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                return b();
            case 4:
                return b();
            case 5:
                return b();
            case 6:
                return b();
            case 7:
                return ((gh2.d) kVar.getValue()).a();
            default:
                File file = (File) kVar.getValue();
                file.mkdirs();
                return file;
        }
    }
}
