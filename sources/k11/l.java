package k11;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.so;
import java.io.File;
import java.util.concurrent.Callable;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f78150b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f78151c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Comparable f78152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f78153e;

    public /* synthetic */ l(Object obj, Object obj2, Comparable comparable, Object obj3, int i13) {
        this.f78149a = i13;
        this.f78150b = obj;
        this.f78151c = obj2;
        this.f78152d = comparable;
        this.f78153e = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i13 = this.f78149a;
        Object obj = this.f78153e;
        Comparable comparable = this.f78152d;
        Object obj2 = this.f78151c;
        Object obj3 = this.f78150b;
        switch (i13) {
            case 0:
                m this$0 = (m) obj3;
                f30 pin = (f30) obj2;
                String boardName = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(pin, "$pin");
                Intrinsics.checkNotNullParameter(boardName, "$boardName");
                this$0.f78154a.c(new lr.g(pin, (String) comparable, boardName, this$0.f78156c));
                return Boolean.TRUE;
            case 1:
                bo0 mediaItem = (bo0) obj3;
                Context context = (Context) obj2;
                so aspectRatio = (so) comparable;
                ag1.b dataManager = (ag1.b) obj;
                Intrinsics.checkNotNullParameter(mediaItem, "$mediaItem");
                Intrinsics.checkNotNullParameter(context, "$context");
                Intrinsics.checkNotNullParameter(aspectRatio, "$aspectRatio");
                Intrinsics.checkNotNullParameter(dataManager, "$dataManager");
                k01 videoItem = mediaItem.getVideoItem();
                if (videoItem != null) {
                    RectF o03 = ig1.b.o0(context, (float) aspectRatio.d(), videoItem, null);
                    Bitmap Z = u2.Z(dataManager, videoItem.e(), mediaItem.getStartTimeMs(), ml2.c.c(o03.width()), ml2.c.c(o03.height()), mediaItem.getIsFromFrontFacingCamera() ? ig1.b.X() : null);
                    if (Z != null) {
                        return Z;
                    }
                }
                throw new RuntimeException("Unified Pin mediaList missing first videoItem");
            default:
                Context context2 = (Context) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String fileName = (String) comparable;
                File filePath = (File) obj;
                Intrinsics.checkNotNullParameter(context2, "$context");
                Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
                Intrinsics.checkNotNullParameter(fileName, "$fileName");
                Intrinsics.checkNotNullParameter(filePath, "$filePath");
                return qb0.b.c(context2, null, bitmap, fileName, filePath, true);
        }
    }
}
