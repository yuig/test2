package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class gd {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5511a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5512b;

    /* renamed from: c, reason: collision with root package name */
    public final ApplicationInfo f5513c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f5514d;

    public gd(Context context, String applicationId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f5511a = context;
        this.f5512b = applicationId;
        this.f5513c = context.getApplicationInfo();
        this.f5514d = new AtomicReference();
    }

    public final a.ad a() {
        String encodeToString;
        nm.u uVar = new nm.u();
        Drawable drawable = null;
        try {
            uVar.u("name", this.f5511a.getPackageManager().getApplicationLabel(this.f5511a.getPackageManager().getApplicationInfo(this.f5513c.packageName, 0)).toString());
            uVar.u("packageName", this.f5513c.packageName);
            uVar.u("adMobAppId", this.f5512b);
            CharSequence charSequence = (CharSequence) this.f5514d.get();
            if (charSequence == null || z.j(charSequence)) {
                AtomicReference atomicReference = this.f5514d;
                try {
                    ApplicationInfo applicationInfo = this.f5511a.getPackageManager().getApplicationInfo(this.f5511a.getApplicationInfo().packageName, 0);
                    Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
                    drawable = this.f5511a.getPackageManager().getApplicationIcon(applicationInfo);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (drawable == null) {
                    encodeToString = "";
                } else {
                    drawable.setBounds(0, 0, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
                    Bitmap createBitmap = Bitmap.createBitmap(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, Bitmap.Config.ARGB_8888);
                    Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                    drawable.draw(new Canvas(createBitmap));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                }
                atomicReference.set(encodeToString);
            }
            CharSequence charSequence2 = (CharSequence) this.f5514d.get();
            if (charSequence2 != null && !z.j(charSequence2)) {
                uVar.u("icon", (String) this.f5514d.get());
                uVar.s(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER), "iconWidthPx");
                uVar.s(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER), "iconHeightPx");
            }
            return new pk0(uVar);
        } catch (PackageManager.NameNotFoundException e13) {
            return new kk0(e13, null, null, 6);
        }
    }
}
