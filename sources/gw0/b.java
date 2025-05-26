package gw0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FileOutputStream f66203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f66204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f66205c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InputStream f66206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f66207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f66208f;

    public /* synthetic */ b(Context context, FileOutputStream fileOutputStream, InputStream inputStream, String str, boolean z13, boolean z14) {
        this.f66203a = fileOutputStream;
        this.f66204b = z13;
        this.f66205c = z14;
        this.f66206d = inputStream;
        this.f66207e = context;
        this.f66208f = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FileOutputStream outputStream = this.f66203a;
        Intrinsics.checkNotNullParameter(outputStream, "$outputStream");
        InputStream inputStream = this.f66206d;
        Intrinsics.checkNotNullParameter(inputStream, "$inputStream");
        Context context = this.f66207e;
        Intrinsics.checkNotNullParameter(context, "$context");
        String filePath = this.f66208f;
        Intrinsics.checkNotNullParameter(filePath, "$filePath");
        try {
            if (this.f66204b || this.f66205c) {
                outputStream.write(bs1.c.I1(inputStream));
            } else {
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                if (decodeStream != null) {
                    decodeStream.compress(Bitmap.CompressFormat.JPEG, 90, outputStream);
                }
            }
            outputStream.getChannel().force(true);
            MediaScannerConnection.scanFile(context, new String[]{filePath}, null, null);
            Unit unit = Unit.f80348a;
            dl2.b.J(outputStream, null);
            return Unit.f80348a;
        } finally {
        }
    }
}
