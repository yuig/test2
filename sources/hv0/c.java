package hv0;

import com.pinterest.api.model.fo;
import com.pinterest.api.model.so;
import com.pinterest.api.model.sp;
import com.pinterest.api.model.vn0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final vn0 f70445a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f70446b;

    /* renamed from: c, reason: collision with root package name */
    public final fo f70447c;

    /* renamed from: d, reason: collision with root package name */
    public final sp f70448d;

    /* renamed from: e, reason: collision with root package name */
    public final so f70449e;

    /* renamed from: f, reason: collision with root package name */
    public final List f70450f;

    /* renamed from: g, reason: collision with root package name */
    public final List f70451g;

    /* renamed from: h, reason: collision with root package name */
    public final String f70452h;

    public c(vn0 mediaList, boolean z13, fo volumeMix, sp audioList, so canvasAspectRatio, List drawingPaths, ArrayList overlayBlocks, String pageBackgroundColor) {
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        Intrinsics.checkNotNullParameter(volumeMix, "volumeMix");
        Intrinsics.checkNotNullParameter(audioList, "audioList");
        Intrinsics.checkNotNullParameter(canvasAspectRatio, "canvasAspectRatio");
        Intrinsics.checkNotNullParameter(drawingPaths, "drawingPaths");
        Intrinsics.checkNotNullParameter(overlayBlocks, "overlayBlocks");
        Intrinsics.checkNotNullParameter(pageBackgroundColor, "pageBackgroundColor");
        this.f70445a = mediaList;
        this.f70446b = z13;
        this.f70447c = volumeMix;
        this.f70448d = audioList;
        this.f70449e = canvasAspectRatio;
        this.f70450f = drawingPaths;
        this.f70451g = overlayBlocks;
        this.f70452h = pageBackgroundColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f70445a, cVar.f70445a) && this.f70446b == cVar.f70446b && Intrinsics.d(this.f70447c, cVar.f70447c) && Intrinsics.d(this.f70448d, cVar.f70448d) && Intrinsics.d(this.f70449e, cVar.f70449e) && Intrinsics.d(this.f70450f, cVar.f70450f) && Intrinsics.d(this.f70451g, cVar.f70451g) && Intrinsics.d(this.f70452h, cVar.f70452h);
    }

    public final int hashCode() {
        return this.f70452h.hashCode() + ep.b.c(this.f70451g, ep.b.c(this.f70450f, (this.f70449e.hashCode() + ((this.f70448d.hashCode() + ((this.f70447c.hashCode() + ep.b.e(this.f70446b, this.f70445a.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "IdeaPinCreationPageViewModel(mediaList=" + this.f70445a + ", canRenderVideoAsStaticImage=" + this.f70446b + ", volumeMix=" + this.f70447c + ", audioList=" + this.f70448d + ", canvasAspectRatio=" + this.f70449e + ", drawingPaths=" + this.f70450f + ", overlayBlocks=" + this.f70451g + ", pageBackgroundColor=" + this.f70452h + ")";
    }
}
