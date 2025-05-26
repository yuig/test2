package s;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class b {
    public void extraCallback(@NonNull String str, Bundle bundle) {
    }

    public Bundle extraCallbackWithResult(@NonNull String str, Bundle bundle) {
        return null;
    }

    public void onActivityLayout(int i13, int i14, int i15, int i16, int i17, @NonNull Bundle bundle) {
    }

    public void onActivityResized(int i13, int i14, @NonNull Bundle bundle) {
    }

    public void onMessageChannelReady(Bundle bundle) {
    }

    public void onMinimized(@NonNull Bundle bundle) {
    }

    public abstract void onNavigationEvent(int i13, Bundle bundle);

    public void onPostMessage(@NonNull String str, Bundle bundle) {
    }

    public void onRelationshipValidationResult(int i13, @NonNull Uri uri, boolean z13, Bundle bundle) {
    }

    public void onUnminimized(@NonNull Bundle bundle) {
    }

    public void onWarmupCompleted(@NonNull Bundle bundle) {
    }
}
