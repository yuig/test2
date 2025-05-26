package wf1;

import android.os.Environment;
import android.os.StatFs;
import vb0.m;

/* loaded from: classes5.dex */
public final class a {
    public static b a() {
        double availableBytes = new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes() / m.MEGABYTE.getBytes$common_release();
        return availableBytes > 100.0d ? b.AVAILABLE : availableBytes > 10.0d ? b.NEAR_LIMIT : b.UNAVAILABLE;
    }
}
