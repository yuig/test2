package np;

import android.graphics.Bitmap;
import android.os.Parcelable;
import com.pinterest.activity.create.PinItActivity;
import com.pinterest.api.model.PinnableImage;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;

/* loaded from: classes3.dex */
public final class p implements hs1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinItActivity f91702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f91703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f91704c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f91705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ConcurrentHashMap f91706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vd0.a f91707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qp.k f91708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f91709h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0 f91710i;

    public p(PinItActivity pinItActivity, h0 h0Var, String str, String str2, ConcurrentHashMap concurrentHashMap, vd0.a aVar, qp.k kVar, List list, h0 h0Var2) {
        this.f91702a = pinItActivity;
        this.f91703b = h0Var;
        this.f91704c = str;
        this.f91705d = str2;
        this.f91706e = concurrentHashMap;
        this.f91707f = aVar;
        this.f91708g = kVar;
        this.f91709h = list;
        this.f91710i = h0Var2;
    }

    @Override // hs1.o
    public final void d() {
        PinItActivity pinItActivity = this.f91702a;
        if (pinItActivity.f34927l) {
            return;
        }
        h0 h0Var = this.f91710i;
        int i13 = h0Var.f80426a + 1;
        h0Var.f80426a = i13;
        PinItActivity.x(pinItActivity, this.f91708g, this.f91707f, this.f91706e, this.f91709h, i13, this.f91703b.f80426a);
    }

    @Override // hs1.o
    public final void k(Bitmap bitmap) {
        PinnableImage pinnableImage;
        qp.k kVar;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        PinItActivity pinItActivity = this.f91702a;
        if (pinItActivity.f34927l) {
            return;
        }
        int width = bitmap.getWidth();
        h0 h0Var = this.f91703b;
        if (width >= 75 && bitmap.getHeight() >= 75) {
            if (bitmap.getHeight() * bitmap.getWidth() <= 89478485) {
                String uuid = UUID.randomUUID().toString();
                int width2 = bitmap.getWidth();
                int height = bitmap.getHeight();
                String str = this.f91704c;
                Parcelable.Creator<PinnableImage> creator = PinnableImage.CREATOR;
                String str2 = this.f91705d;
                if (str2 != null) {
                    try {
                        pinnableImage = new PinnableImage();
                        pinnableImage.f35564a = uuid;
                        pinnableImage.f35569f = str2;
                        pinnableImage.f35570g = str;
                        pinnableImage.f35565b = width2;
                        pinnableImage.f35566c = height;
                    } catch (Exception unused) {
                    }
                    this.f91706e.put(str2, pinnableImage);
                    if (this.f91707f.d() == 1 && Intrinsics.d("share_extension_android", pinItActivity.z()) && (kVar = this.f91708g) != null) {
                        Intrinsics.f(pinnableImage);
                        kVar.c8(pinnableImage);
                    }
                    PinItActivity.x(this.f91702a, this.f91708g, this.f91707f, this.f91706e, this.f91709h, this.f91710i.f80426a, h0Var.f80426a);
                }
                pinnableImage = null;
                this.f91706e.put(str2, pinnableImage);
                if (this.f91707f.d() == 1) {
                    Intrinsics.f(pinnableImage);
                    kVar.c8(pinnableImage);
                }
                PinItActivity.x(this.f91702a, this.f91708g, this.f91707f, this.f91706e, this.f91709h, this.f91710i.f80426a, h0Var.f80426a);
            }
        }
        h0Var.f80426a++;
        PinItActivity.x(this.f91702a, this.f91708g, this.f91707f, this.f91706e, this.f91709h, this.f91710i.f80426a, h0Var.f80426a);
    }
}
