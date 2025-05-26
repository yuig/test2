package com.linecorp.linesdk.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.linecorp.linesdk.LoginDelegate;
import com.linecorp.linesdk.LoginListener;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.auth.internal.LineAuthenticationActivity;
import com.linecorp.linesdk.internal.FragmentWrapper;
import com.linecorp.linesdk.internal.LoginHandler;
import com.linecorp.linesdk.widget.LoginButton;
import d5.a;
import java.util.Arrays;
import java.util.concurrent.Executors;
import m.h;
import rn.e;
import rn.f;
import rn.i;
import rn.j;
import wn.b;
import wn.c;

/* loaded from: classes3.dex */
public class LoginButton extends AppCompatTextView {

    @NonNull
    private LineAuthenticationParams authenticationParams;
    private String channelId;
    private FragmentWrapper fragmentWrapper;

    @NonNull
    private View.OnClickListener internalListener;
    private boolean isLineAppAuthEnabled;
    private LoginDelegate loginDelegate;

    @NonNull
    private LoginHandler loginHandler;

    public LoginButton(Context context) {
        super(context, null);
        this.isLineAppAuthEnabled = true;
        final int i13 = 0;
        h hVar = new h(23, 0);
        hVar.f85197b = Arrays.asList(j.f108817c);
        this.authenticationParams = new LineAuthenticationParams(hVar);
        this.loginHandler = new LoginHandler();
        this.internalListener = new View.OnClickListener(this) { // from class: co.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginButton f28271b;

            {
                this.f28271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                this.f28271b.lambda$new$0(view);
            }
        };
        init();
    }

    @NonNull
    private Activity getActivity() {
        Context context = getContext();
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        throw new RuntimeException("Cannot find an Activity");
    }

    private void init() {
        setAllCaps(false);
        setGravity(17);
        setText(i.btn_line_login);
        Context context = getContext();
        int i13 = e.text_login_btn;
        Object obj = a.f53679a;
        setTextColor(context.getColor(i13));
        setBackgroundResource(f.background_login_btn);
        super.setOnClickListener(this.internalListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        String str = this.channelId;
        if (str == null) {
            throw new RuntimeException("Channel id should be set.");
        }
        if (str.isEmpty()) {
            throw new RuntimeException("Channel id should not be empty.");
        }
        FragmentWrapper fragmentWrapper = this.fragmentWrapper;
        if (fragmentWrapper != null) {
            performLoginWithFragment(this.channelId, fragmentWrapper);
        } else {
            performLoginWithActivity(this.channelId, getActivity());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnClickListener$1(View.OnClickListener onClickListener, View view) {
        this.internalListener.onClick(view);
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    private void performLoginWithActivity(@NonNull String str, @NonNull Activity activity) {
        Intent intent;
        LoginHandler loginHandler = this.loginHandler;
        boolean z13 = this.isLineAppAuthEnabled;
        LineAuthenticationParams lineAuthenticationParams = this.authenticationParams;
        loginHandler.getClass();
        int i13 = 0;
        if (z13) {
            LineAuthenticationConfig lineAuthenticationConfig = new LineAuthenticationConfig(new un.a(activity, str));
            if (!c.f130434b) {
                c.f130434b = true;
                Executors.newSingleThreadExecutor().execute(new b(activity.getApplicationContext(), i13));
            }
            int i14 = LineAuthenticationActivity.f34082d;
            intent = new Intent(activity, (Class<?>) LineAuthenticationActivity.class);
            intent.putExtra("authentication_config", lineAuthenticationConfig);
            intent.putExtra("authentication_params", lineAuthenticationParams);
        } else {
            un.a aVar = new un.a(activity, str);
            aVar.f122817e = true;
            LineAuthenticationConfig lineAuthenticationConfig2 = new LineAuthenticationConfig(aVar);
            if (!c.f130434b) {
                c.f130434b = true;
                Executors.newSingleThreadExecutor().execute(new b(activity.getApplicationContext(), i13));
            }
            int i15 = LineAuthenticationActivity.f34082d;
            intent = new Intent(activity, (Class<?>) LineAuthenticationActivity.class);
            intent.putExtra("authentication_config", lineAuthenticationConfig2);
            intent.putExtra("authentication_params", lineAuthenticationParams);
        }
        activity.startActivityForResult(intent, 1);
    }

    private void performLoginWithFragment(@NonNull String str, @NonNull FragmentWrapper fragmentWrapper) {
        Intent intent;
        LoginHandler loginHandler = this.loginHandler;
        Activity activity = getActivity();
        boolean z13 = this.isLineAppAuthEnabled;
        LineAuthenticationParams lineAuthenticationParams = this.authenticationParams;
        loginHandler.getClass();
        int i13 = 0;
        if (z13) {
            LineAuthenticationConfig lineAuthenticationConfig = new LineAuthenticationConfig(new un.a(activity, str));
            if (!c.f130434b) {
                c.f130434b = true;
                Executors.newSingleThreadExecutor().execute(new b(activity.getApplicationContext(), i13));
            }
            int i14 = LineAuthenticationActivity.f34082d;
            intent = new Intent(activity, (Class<?>) LineAuthenticationActivity.class);
            intent.putExtra("authentication_config", lineAuthenticationConfig);
            intent.putExtra("authentication_params", lineAuthenticationParams);
        } else {
            un.a aVar = new un.a(activity, str);
            aVar.f122817e = true;
            LineAuthenticationConfig lineAuthenticationConfig2 = new LineAuthenticationConfig(aVar);
            if (!c.f130434b) {
                c.f130434b = true;
                Executors.newSingleThreadExecutor().execute(new b(activity.getApplicationContext(), i13));
            }
            int i15 = LineAuthenticationActivity.f34082d;
            intent = new Intent(activity, (Class<?>) LineAuthenticationActivity.class);
            intent.putExtra("authentication_config", lineAuthenticationConfig2);
            intent.putExtra("authentication_params", lineAuthenticationParams);
        }
        Fragment fragment = fragmentWrapper.f34139a;
        if (fragment != null) {
            fragment.startActivityForResult(intent, 1);
            return;
        }
        androidx.fragment.app.Fragment fragment2 = fragmentWrapper.f34140b;
        if (fragment2 != null) {
            fragment2.startActivityForResult(intent, 1);
        }
    }

    public void addLoginListener(@NonNull LoginListener loginListener) {
        if (this.loginDelegate == null) {
            throw new RuntimeException("You must set LoginDelegate through setLoginDelegate()  first");
        }
        this.loginHandler.f34141a.add(loginListener);
    }

    public void enableLineAppAuthentication(boolean z13) {
        this.isLineAppAuthEnabled = z13;
    }

    public void removeLoginListener(@NonNull LoginListener loginListener) {
        this.loginHandler.f34141a.remove(loginListener);
    }

    public void setAuthenticationParams(@NonNull LineAuthenticationParams lineAuthenticationParams) {
        this.authenticationParams = lineAuthenticationParams;
    }

    public void setChannelId(@NonNull String str) {
        this.channelId = str;
    }

    public void setFragment(@NonNull Fragment fragment) {
        FragmentWrapper fragmentWrapper = new FragmentWrapper();
        fragmentWrapper.f34139a = fragment;
        this.fragmentWrapper = fragmentWrapper;
    }

    public void setLoginDelegate(@NonNull LoginDelegate loginDelegate) {
        throw new RuntimeException("Unexpected LoginDelegate, please use the provided Factory to create the instance");
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new co.a(0, this, onClickListener));
    }

    public void setFragment(@NonNull androidx.fragment.app.Fragment fragment) {
        FragmentWrapper fragmentWrapper = new FragmentWrapper();
        fragmentWrapper.f34140b = fragment;
        this.fragmentWrapper = fragmentWrapper;
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        final int i13 = 1;
        this.isLineAppAuthEnabled = true;
        h hVar = new h(23, 0);
        hVar.f85197b = Arrays.asList(j.f108817c);
        this.authenticationParams = new LineAuthenticationParams(hVar);
        this.loginHandler = new LoginHandler();
        this.internalListener = new View.OnClickListener(this) { // from class: co.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginButton f28271b;

            {
                this.f28271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                this.f28271b.lambda$new$0(view);
            }
        };
        init();
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.isLineAppAuthEnabled = true;
        h hVar = new h(23, 0);
        hVar.f85197b = Arrays.asList(j.f108817c);
        this.authenticationParams = new LineAuthenticationParams(hVar);
        this.loginHandler = new LoginHandler();
        final int i14 = 2;
        this.internalListener = new View.OnClickListener(this) { // from class: co.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginButton f28271b;

            {
                this.f28271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                this.f28271b.lambda$new$0(view);
            }
        };
        init();
    }
}
