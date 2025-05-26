package z71;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.pinterest.api.model.vq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lz71/f;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "id", "Lz71/b;", "Lz71/b;", "getType", "()Lz71/b;", "type", "Landroid/graphics/Matrix;", "c", "Landroid/graphics/Matrix;", "()Landroid/graphics/Matrix;", "matrix", "Lcom/pinterest/api/model/vq;", "d", "Lcom/pinterest/api/model/vq;", "getRotatedRect", "()Lcom/pinterest/api/model/vq;", "rotatedRect", "Landroid/graphics/RectF;", "e", "Landroid/graphics/RectF;", "getRect", "()Landroid/graphics/RectF;", "rect", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class f {

    /* renamed from: a, reason: from kotlin metadata */
    @om.b("id")
    @NotNull
    private final String id;

    /* renamed from: b, reason: from kotlin metadata */
    @om.b("type")
    @NotNull
    private final b type;

    /* renamed from: c, reason: from kotlin metadata */
    @om.b("matrix")
    private final Matrix matrix;

    /* renamed from: d, reason: from kotlin metadata */
    @om.b("rotatedRect")
    private final vq rotatedRect;

    /* renamed from: e, reason: from kotlin metadata */
    @om.b("rect")
    private final RectF rect;

    public f(String id3, b type, Matrix matrix, vq vqVar, RectF rectF) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id3;
        this.type = type;
        this.matrix = matrix;
        this.rotatedRect = vqVar;
        this.rect = rectF;
    }

    public static f a(f fVar, Matrix matrix, vq vqVar, RectF rectF, int i13) {
        String id3 = fVar.id;
        b type = fVar.type;
        if ((i13 & 8) != 0) {
            vqVar = fVar.rotatedRect;
        }
        vq vqVar2 = vqVar;
        if ((i13 & 16) != 0) {
            rectF = fVar.rect;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return new f(id3, type, matrix, vqVar2, rectF);
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final Matrix getMatrix() {
        return this.matrix;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(f.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.d(this.matrix, ((f) obj).matrix);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + (this.id.hashCode() * 31)) * 31;
        Matrix matrix = this.matrix;
        int hashCode2 = (hashCode + (matrix == null ? 0 : matrix.hashCode())) * 31;
        vq vqVar = this.rotatedRect;
        int hashCode3 = (hashCode2 + (vqVar == null ? 0 : vqVar.hashCode())) * 31;
        RectF rectF = this.rect;
        return hashCode3 + (rectF != null ? rectF.hashCode() : 0);
    }

    public final String toString() {
        return "CollageOverlayItemConfig(id=" + this.id + ", type=" + this.type + ", matrix=" + this.matrix + ", rotatedRect=" + this.rotatedRect + ", rect=" + this.rect + ")";
    }
}
