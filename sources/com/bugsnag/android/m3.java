package com.bugsnag.android;

import android.text.TextUtils;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashMap;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes3.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f29349a;

    static {
        HashMap hashMap = new HashMap();
        f29349a = hashMap;
        hashMap.put(1, "DiskWrite");
        hashMap.put(2, "DiskRead");
        hashMap.put(4, "NetworkOperation");
        hashMap.put(8, "CustomSlowCall");
        hashMap.put(16, "ResourceMismatch");
        hashMap.put(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER), "CursorLeak");
        hashMap.put(Integer.valueOf(BitmapUtils.BITMAP_TO_JPEG_SIZE), "CloseableLeak");
        hashMap.put(1024, "ActivityLeak");
        hashMap.put(2048, "InstanceLeak");
        hashMap.put(4096, "RegistrationLeak");
        hashMap.put(8192, "FileUriLeak");
        hashMap.put(16384, "CleartextNetwork");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        int lastIndexOf = str.lastIndexOf("violation=");
        if (lastIndexOf == -1) {
            return null;
        }
        String replace = str.substring(lastIndexOf).replace("violation=", "");
        if (!TextUtils.isDigitsOnly(replace)) {
            return null;
        }
        return (String) f29349a.get(Integer.valueOf(replace));
    }
}
