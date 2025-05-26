package a;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public interface p1 {
    View a();

    void a(View view);

    void a(FrameLayout frameLayout);

    void a(FrameLayout frameLayout, Map map, Map map2);

    boolean b();

    View c();

    boolean d();

    float e();

    ArrayList f();

    String getAdvertiser();

    String getBody();

    String getCallToAction();

    Bundle getExtras();

    boolean getHasVideoContent();

    String getHeadline();

    k2 getIcon();

    String getPrice();

    String getStore();

    void recordImpression();
}
