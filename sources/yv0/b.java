package yv0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import zv0.j;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f140197i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f140198j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f140199k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z13, c cVar, int i13) {
        super(1);
        this.f140197i = z13;
        this.f140198j = cVar;
        this.f140199k = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (this.f140197i) {
            Matrix matrix = new Matrix();
            matrix.preScale(-1.0f, 1.0f);
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        }
        ((j) ((vv0.c) this.f140198j.getView())).Y8(this.f140199k, bitmap);
        return Unit.f80348a;
    }
}
