package tt0;

import android.media.MediaScannerConnection;
import android.os.Bundle;
import com.pinterest.api.model.d30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lq0.f1;

/* loaded from: classes5.dex */
public final class k0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119164i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l0 f119165j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f119166k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(l0 l0Var, long j13, int i13) {
        super(1);
        this.f119164i = i13;
        this.f119165j = l0Var;
        this.f119166k = j13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f119164i;
        long j13 = this.f119166k;
        l0 l0Var = this.f119165j;
        switch (i13) {
            case 0:
                File file = (File) obj;
                Intrinsics.checkNotNullParameter(file, "it");
                z zVar = l0Var.J0;
                if (zVar == null) {
                    Intrinsics.r("cameraController");
                    throw null;
                }
                String announcement = l0Var.requireContext().getString(aq1.h.accessibility_camera_photo_captured);
                Intrinsics.checkNotNullExpressionValue(announcement, "getString(...)");
                Intrinsics.checkNotNullParameter(announcement, "announcement");
                zVar.o().announceForAccessibility(announcement);
                MediaScannerConnection.scanFile(l0Var.getContext(), new String[]{file.getAbsolutePath()}, null, null);
                l0Var.f119182r0.post(new dp.a(24, file, l0Var));
                st0.c g83 = l0Var.g8();
                g83.getClass();
                Intrinsics.checkNotNullParameter(file, "file");
                String path = file.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                d30 photoItem = new d30(path, null, 2, null);
                boolean z13 = g83.f115167c;
                l0 l0Var2 = g83.f115165a;
                if (z13) {
                    l0Var2.getClass();
                    Intrinsics.checkNotNullParameter(photoItem, "photoItem");
                    Bundle result = new Bundle();
                    result.putString("com.pinterest.EXTRA_CREATE_MEDIA_URI", photoItem.f41101b.toString());
                    Unit unit = Unit.f80348a;
                    Intrinsics.checkNotNullParameter(result, "result");
                    l0Var2.P6(String.valueOf(RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_THUMBNAIL), result);
                    l0Var2.D5();
                } else if (g83.m1()) {
                    lg1.h hVar = g83.f115170f;
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(photoItem, "mediaItem");
                    hVar.f83272j.add(photoItem);
                    hVar.c();
                } else {
                    l0Var2.getClass();
                    Intrinsics.checkNotNullParameter(photoItem, "photoItem");
                    fp0.d dVar = l0Var2.f119189y0;
                    if (dVar == null) {
                        Intrinsics.r("cameraView");
                        throw null;
                    }
                    l0Var2.f119180p0.c(photoItem, dVar.k());
                    l0Var2.p8(new d0(l0Var2, 12));
                }
                g83.f115169e = photoItem;
                ag1.i iVar = ag1.i.IMAGE;
                ag1.h hVar2 = l0Var.f119175k0;
                if (hVar2 == null) {
                    Intrinsics.r("ideaPinSessionDataManager");
                    throw null;
                }
                hVar2.d(new f1(iVar, 27), false);
                xj2.c F = uj2.q.M(3000L, TimeUnit.MILLISECONDS, wj2.c.a()).F(new kt0.x(16, new e0(l0Var, 8)), new kt0.x(17, new e0(l0Var, 9)), ck2.i.f27923c, ck2.i.f27924d);
                Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                l0Var.R6(F);
                l0Var.m8(ag1.g.CAMERA_TAKE_PHOTO_SUCCESS, Long.valueOf(System.currentTimeMillis() - j13), null);
                return Unit.f80348a;
            default:
                Exception it = (Exception) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                l0.Z7(l0Var);
                long currentTimeMillis = System.currentTimeMillis() - j13;
                if (l0Var.isResumed()) {
                    l0Var.h8().h(m60.x0.oops_something_went_wrong);
                    l0Var.m8(ag1.g.CAMERA_TAKE_PHOTO_FAIL, Long.valueOf(currentTimeMillis), it);
                    if (l0Var.e8().b()) {
                        r0.h hVar3 = fp0.c.f62759q;
                        lp2.b.k(l0Var.b6(), "Error taking photo: " + it, it);
                    } else {
                        l0Var.b6().q(it, "Error when taking photo", tb0.p.IDEA_PINS_CREATION);
                    }
                } else {
                    l0Var.m8(ag1.g.CAMERA_TAKE_PHOTO_CANCEL, Long.valueOf(currentTimeMillis), it);
                }
                return Unit.f80348a;
        }
    }
}
