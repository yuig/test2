package j72;

import android.graphics.Bitmap;
import c72.u;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import org.chromium.net.y;

/* loaded from: classes4.dex */
public final class d implements s72.a {

    /* renamed from: a, reason: collision with root package name */
    public final k72.a f74859a;

    /* renamed from: b, reason: collision with root package name */
    public final c72.q f74860b;

    /* renamed from: c, reason: collision with root package name */
    public final u f74861c;

    /* renamed from: d, reason: collision with root package name */
    public final y f74862d;

    /* renamed from: e, reason: collision with root package name */
    public final n72.a f74863e;

    public d(k72.a shufflesService, c72.q entityMapper, u modelMapperShuffle, y shuffleMemoryDataSource, n72.a dispatcherProvider) {
        Intrinsics.checkNotNullParameter(shufflesService, "shufflesService");
        Intrinsics.checkNotNullParameter(entityMapper, "entityMapper");
        Intrinsics.checkNotNullParameter(modelMapperShuffle, "modelMapperShuffle");
        Intrinsics.checkNotNullParameter(shuffleMemoryDataSource, "shuffleMemoryDataSource");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.f74859a = shufflesService;
        this.f74860b = entityMapper;
        this.f74861c = modelMapperShuffle;
        this.f74862d = shuffleMemoryDataSource;
        this.f74863e = dispatcherProvider;
    }

    public static final RequestBody$Companion$toRequestBody$2 a(d dVar, Bitmap bitmap) {
        dVar.getClass();
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        RequestBody.Companion companion = RequestBody.f95711a;
        Intrinsics.f(byteArray);
        return RequestBody.Companion.e(companion, byteArray, null, 7);
    }
}
