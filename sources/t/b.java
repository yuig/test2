package t;

import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.LinkedHashSet;
import sp2.i;
import w.t;

/* loaded from: classes2.dex */
public final /* synthetic */ class b {
    public static i a(Context context, t tVar, LinkedHashSet linkedHashSet) {
        try {
            return new i(context, tVar, linkedHashSet);
        } catch (CameraUnavailableException e13) {
            throw new InitializationException(e13);
        }
    }
}
