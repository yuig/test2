package g0;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.google.common.util.concurrent.c0;
import com.pinterest.api.model.nq;
import com.pinterest.feature.ideaPinCreation.closeup.view.f0;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.Util;
import qz.x;
import uj2.e0;
import uj2.s;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements r4.j, rg.f, s, uj2.e, e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f63191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f63192c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f63193d;

    public /* synthetic */ e(Object obj, Object obj2, long j13, int i13) {
        this.f63190a = i13;
        this.f63192c = obj;
        this.f63193d = obj2;
        this.f63191b = j13;
    }

    @Override // r4.j
    public final Object C(final r4.i iVar) {
        final c0 c0Var = (c0) this.f63192c;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f63193d;
        m.g(c0Var, iVar);
        if (!c0Var.isDone()) {
            final long j13 = this.f63191b;
            c0Var.d(new g(scheduledExecutorService.schedule(new Callable() { // from class: g0.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(r4.i.this.d(new TimeoutException("Future[" + c0Var + "] is not done within " + j13 + " ms.")));
                }
            }, j13, TimeUnit.MILLISECONDS), 0), l3.c.s());
        }
        return "TimeoutFuture[" + c0Var + "]";
    }

    @Override // rg.f
    public final Object apply(Object obj) {
        String str = (String) this.f63192c;
        og.a aVar = (og.a) this.f63193d;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        boolean booleanValue = ((Boolean) rg.g.g(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(aVar.getNumber())}), new a.e(29))).booleanValue();
        long j13 = this.f63191b;
        if (booleanValue) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j13 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(aVar.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(aVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j13));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    @Override // uj2.e0
    public final void g(kk2.a emitter) {
        tw0.g this$0 = (tw0.g) this.f63192c;
        HttpUrl url = (HttpUrl) this.f63193d;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        x eventListener = new x();
        this$0.getClass();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j13 = this.f63191b;
        builder.b(j13, timeUnit);
        builder.f95679f = false;
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        byte[] bArr = Util.f95757a;
        Intrinsics.checkNotNullParameter(eventListener, "<this>");
        builder.f95678e = new uo2.a(eventListener);
        OkHttpClient okHttpClient = new OkHttpClient(builder);
        Request.Builder builder2 = new Request.Builder();
        Intrinsics.checkNotNullParameter(url, "url");
        builder2.f95706a = url;
        okHttpClient.newCall(builder2.b()).k1(new tw0.f(eventListener, j13, emitter));
    }

    @Override // uj2.e
    public final void n(fk2.f emitter) {
        f0 pageView = (f0) this.f63192c;
        nq overlayBlock = (nq) this.f63193d;
        Intrinsics.checkNotNullParameter(pageView, "$pageView");
        Intrinsics.checkNotNullParameter(overlayBlock, "$overlayBlock");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        pageView.p1(overlayBlock, new uv0.d(emitter, 8), new uv0.d(emitter, 9), this.f63191b);
    }

    @Override // uj2.s
    public final void o(fk2.f emitter) {
        Bitmap bitmap;
        Bitmap bitmap2;
        int i13 = this.f63190a;
        Bitmap bitmap3 = null;
        long j13 = this.f63191b;
        Object obj = this.f63193d;
        Object obj2 = this.f63192c;
        switch (i13) {
            case 2:
                eu0.c this$0 = (eu0.c) obj2;
                String path = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(path, "$path");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                float dimensionPixelSize = (((yk1.a) this$0.f60167c).f139224a.getDimensionPixelSize(aq1.b.story_pin_video_trimmer_preview_width) * 1.0f) / 8;
                float f13 = dimensionPixelSize / 0.5625f;
                int c13 = ml2.c.c(dimensionPixelSize);
                int c14 = ml2.c.c(f13);
                String D = ig1.b.D(j13, path, c13, c14);
                ag1.b bVar = this$0.f60168d;
                Bitmap e13 = bVar.e(D);
                if (e13 != null) {
                    bitmap3 = e13;
                } else {
                    LinkedHashMap linkedHashMap = this$0.f60173i;
                    if (!linkedHashMap.containsKey(path)) {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(path);
                        linkedHashMap.put(path, mediaMetadataRetriever);
                    }
                    Object obj3 = linkedHashMap.get(path);
                    Intrinsics.f(obj3);
                    MediaMetadataRetriever mediaMetadataRetriever2 = (MediaMetadataRetriever) obj3;
                    this$0.f60165a.getClass();
                    try {
                        bitmap = mediaMetadataRetriever2.getFrameAtTime(j13);
                    } catch (RuntimeException unused) {
                        bitmap = null;
                    }
                    Bitmap i14 = bitmap == null ? null : rw0.f.i(c14, bitmap);
                    if (i14 != null) {
                        bVar.g(i14, D);
                        bitmap3 = i14;
                    }
                }
                if (bitmap3 != null) {
                    emitter.c(bitmap3);
                }
                emitter.b();
                break;
            default:
                yv0.c this$02 = (yv0.c) obj2;
                String path2 = (String) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(path2, "$path");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                float dimensionPixelSize2 = (((yk1.a) this$02.f140201b).f139224a.getDimensionPixelSize(aq1.b.story_pin_video_trimmer_preview_width) * 1.0f) / 8;
                float f14 = dimensionPixelSize2 / 0.5625f;
                int c15 = ml2.c.c(dimensionPixelSize2);
                int c16 = ml2.c.c(f14);
                String D2 = ig1.b.D(j13, path2, c15, c16);
                ag1.b bVar2 = this$02.f140203d;
                Bitmap e14 = bVar2.e(D2);
                if (e14 != null) {
                    bitmap3 = e14;
                } else {
                    LinkedHashMap linkedHashMap2 = this$02.f140216q;
                    if (!linkedHashMap2.containsKey(path2)) {
                        MediaMetadataRetriever mediaMetadataRetriever3 = new MediaMetadataRetriever();
                        mediaMetadataRetriever3.setDataSource(path2);
                        linkedHashMap2.put(path2, mediaMetadataRetriever3);
                    }
                    Object obj4 = linkedHashMap2.get(path2);
                    Intrinsics.f(obj4);
                    MediaMetadataRetriever mediaMetadataRetriever4 = (MediaMetadataRetriever) obj4;
                    this$02.f140205f.getClass();
                    try {
                        bitmap2 = mediaMetadataRetriever4.getFrameAtTime(j13);
                    } catch (RuntimeException unused2) {
                        bitmap2 = null;
                    }
                    Bitmap i15 = bitmap2 == null ? null : rw0.f.i(c16, bitmap2);
                    if (i15 != null) {
                        bVar2.g(i15, D2);
                        bitmap3 = i15;
                    }
                }
                if (bitmap3 != null) {
                    emitter.c(bitmap3);
                } else {
                    emitter.d(new Throwable());
                }
                emitter.b();
                break;
        }
    }

    public /* synthetic */ e(tw0.g gVar, long j13, HttpUrl httpUrl) {
        this.f63190a = 5;
        this.f63192c = gVar;
        this.f63191b = j13;
        this.f63193d = httpUrl;
    }
}
