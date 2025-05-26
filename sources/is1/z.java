package is1;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.MediaStore;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final Regex f73661d = new Regex("(?i).*" + MediaStore.Images.Media.EXTERNAL_CONTENT_URI + ".*");

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f73662e = {"_display_name", "_data", "date_added"};

    /* renamed from: f, reason: collision with root package name */
    public static final String f73663f = "date_added DESC";

    /* renamed from: a, reason: collision with root package name */
    public final String f73664a;

    /* renamed from: b, reason: collision with root package name */
    public ContentResolver f73665b;

    /* renamed from: c, reason: collision with root package name */
    public y f73666c;

    public z(String screenshotPath) {
        Intrinsics.checkNotNullParameter(screenshotPath, "screenshotPath");
        this.f73664a = screenshotPath;
    }

    public final void a(Context context, tb0.p pinterestProductAreas) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinterestProductAreas, "pinterestProductAreas");
        this.f73665b = context.getContentResolver();
        y yVar = new y(pinterestProductAreas, this);
        this.f73666c = yVar;
        ContentResolver contentResolver = this.f73665b;
        if (contentResolver != null) {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, yVar);
        }
    }

    public final void b() {
        ContentResolver contentResolver;
        y yVar = this.f73666c;
        if (yVar == null || (contentResolver = this.f73665b) == null) {
            return;
        }
        contentResolver.unregisterContentObserver(yVar);
    }
}
