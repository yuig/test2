package zq;

import android.graphics.Bitmap;
import android.util.Log;
import hs1.o;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f142633b;

    public /* synthetic */ b(f fVar, int i13) {
        this.f142632a = i13;
        this.f142633b = fVar;
    }

    @Override // hs1.o
    public final void d() {
        switch (this.f142632a) {
            case 0:
                Log.e("PincodePresenter", "Loading the Bitmap from the board Pin's image urls failed");
                break;
            default:
                Log.e("PincodePresenter", "Loading the Bitmap from the user profile imageUrl failed");
                break;
        }
    }

    @Override // hs1.o
    public final void k(Bitmap bitmap) {
        int i13 = this.f142632a;
        f fVar = this.f142633b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                if (fVar.isBound()) {
                    ArrayList arrayList = fVar.f142647i;
                    arrayList.add(bitmap);
                    if (arrayList.size() == 4) {
                        fVar.f142650l.b();
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                if (fVar.isBound()) {
                    fVar.s3(bitmap);
                    break;
                }
                break;
        }
    }
}
