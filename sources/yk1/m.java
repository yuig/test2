package yk1;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes2.dex */
public interface m {
    void activate();

    void activityResult(int i13, int i14, Intent intent);

    void bind(n nVar);

    void create();

    void deactivate();

    void destroy();

    boolean isBound();

    void restore();

    void restoreInstanceState(Bundle bundle);

    void saveInstanceState(Bundle bundle);

    void unbind();
}
