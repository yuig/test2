package us1;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes2.dex */
public interface a {
    void g();

    Activity getContext();

    default boolean i() {
        return true;
    }

    void startActivity(Intent intent);
}
