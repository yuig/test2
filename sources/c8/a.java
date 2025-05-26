package c8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.scheduler.Requirements;
import androidx.navigation.NavBackStackEntryState;
import androidx.versionedparcelable.ParcelImpl;
import com.facebook.AuthenticationToken;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.AuthenticationTokenHeader;
import com.facebook.GraphRequest$ParcelableResourceWithMimeType;
import com.facebook.Profile;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.DeviceAuthMethodHandler;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.InstagramAppLoginMethodHandler;
import com.facebook.login.KatanaProxyLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.facebook.login.WebViewLoginMethodHandler;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.AppGroupCreationContent;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import df.j1;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26935a;

    public /* synthetic */ a(int i13) {
        this.f26935a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel inParcel) {
        switch (this.f26935a) {
            case 0:
                return new Requirements(inParcel.readInt());
            case 1:
                Intrinsics.checkNotNullParameter(inParcel, "inParcel");
                return new NavBackStackEntryState(inParcel);
            case 2:
                return new ParcelImpl(inParcel);
            case 3:
                Intrinsics.checkNotNullParameter(inParcel, "source");
                return new AuthenticationToken(inParcel);
            case 4:
                Intrinsics.checkNotNullParameter(inParcel, "source");
                return new AuthenticationTokenClaims(inParcel);
            case 5:
                Intrinsics.checkNotNullParameter(inParcel, "source");
                return new AuthenticationTokenHeader(inParcel);
            case 6:
                Intrinsics.checkNotNullParameter(inParcel, "source");
                return new GraphRequest$ParcelableResourceWithMimeType(inParcel);
            case 7:
                Intrinsics.checkNotNullParameter(inParcel, "source");
                return new Profile(inParcel);
            case 8:
                Intrinsics.checkNotNullParameter(inParcel, "source");
                return new CustomTabLoginMethodHandler(inParcel);
            case 9:
                Intrinsics.checkNotNullParameter(inParcel, "source");
                return new DeviceAuthMethodHandler(inParcel);
            case 10:
                Intrinsics.checkNotNullParameter(inParcel, "source");
                return new GetTokenLoginMethodHandler(inParcel);
            case 11:
                Intrinsics.checkNotNullParameter(inParcel, "source");
                return new InstagramAppLoginMethodHandler(inParcel);
            case 12:
                Intrinsics.checkNotNullParameter(inParcel, "source");
                return new KatanaProxyLoginMethodHandler(inParcel);
            case 13:
                Intrinsics.checkNotNullParameter(inParcel, "source");
                Intrinsics.checkNotNullParameter(inParcel, "source");
                LoginClient loginClient = new LoginClient();
                loginClient.f29955b = -1;
                Parcelable[] readParcelableArray = inParcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
                if (readParcelableArray == null) {
                    readParcelableArray = new Parcelable[0];
                }
                ArrayList arrayList = new ArrayList();
                int length = readParcelableArray.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        loginClient.f29954a = (LoginMethodHandler[]) array;
                        loginClient.f29955b = inParcel.readInt();
                        loginClient.f29960g = (LoginClient.Request) inParcel.readParcelable(LoginClient.Request.class.getClassLoader());
                        HashMap t13 = j1.t1(inParcel);
                        loginClient.f29961h = t13 == null ? null : z0.r(t13);
                        HashMap t14 = j1.t1(inParcel);
                        loginClient.f29962i = t14 != null ? z0.r(t14) : null;
                        return loginClient;
                    }
                    Parcelable parcelable = readParcelableArray[i13];
                    LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
                    if (loginMethodHandler != null) {
                        Intrinsics.checkNotNullParameter(loginClient, "<set-?>");
                        loginMethodHandler.f29993b = loginClient;
                    }
                    if (loginMethodHandler != null) {
                        arrayList.add(loginMethodHandler);
                    }
                    i13++;
                }
            case 14:
                Intrinsics.checkNotNullParameter(inParcel, "source");
                return new WebViewLoginMethodHandler(inParcel);
            case 15:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new ShareFeedContent(inParcel);
            case 16:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new AppGroupCreationContent(inParcel);
            case 17:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new CameraEffectArguments(inParcel);
            case 18:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new CameraEffectTextures(inParcel);
            case 19:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new GameRequestContent(inParcel);
            case 20:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                ShareCameraEffectContent shareCameraEffectContent = new ShareCameraEffectContent(inParcel);
                shareCameraEffectContent.f30114g = inParcel.readString();
                pf.b bVar = new pf.b(0);
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                CameraEffectArguments cameraEffectArguments = (CameraEffectArguments) inParcel.readParcelable(CameraEffectArguments.class.getClassLoader());
                if (cameraEffectArguments != null) {
                    bVar.f100003a.putAll(cameraEffectArguments.f30103a);
                }
                shareCameraEffectContent.f30115h = new CameraEffectArguments(bVar);
                pf.b bVar2 = new pf.b(1);
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                CameraEffectTextures cameraEffectTextures = (CameraEffectTextures) inParcel.readParcelable(CameraEffectTextures.class.getClassLoader());
                if (cameraEffectTextures != null) {
                    bVar2.f100003a.putAll(cameraEffectTextures.f30104a);
                }
                shareCameraEffectContent.f30116i = new CameraEffectTextures(bVar2);
                return shareCameraEffectContent;
            case 21:
                Intrinsics.checkNotNullParameter(inParcel, "source");
                return new ShareHashtag(inParcel);
            case 22:
                Intrinsics.checkNotNullParameter(inParcel, "source");
                return new ShareLinkContent(inParcel);
            case 23:
                Intrinsics.checkNotNullParameter(inParcel, "source");
                return new ShareMediaContent(inParcel);
            case 24:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new ShareMessengerURLActionButton(inParcel);
            case 25:
                Intrinsics.checkNotNullParameter(inParcel, "source");
                return new SharePhoto(inParcel);
            case 26:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new SharePhotoContent(inParcel);
            case 27:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new ShareStoryContent(inParcel);
            case 28:
                Intrinsics.checkNotNullParameter(inParcel, "source");
                return new ShareVideo(inParcel);
            default:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new ShareVideoContent(inParcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f26935a) {
            case 0:
                return new Requirements[i13];
            case 1:
                return new NavBackStackEntryState[i13];
            case 2:
                return new ParcelImpl[i13];
            case 3:
                return new AuthenticationToken[i13];
            case 4:
                return new AuthenticationTokenClaims[i13];
            case 5:
                return new AuthenticationTokenHeader[i13];
            case 6:
                return new GraphRequest$ParcelableResourceWithMimeType[i13];
            case 7:
                return new Profile[i13];
            case 8:
                return new CustomTabLoginMethodHandler[i13];
            case 9:
                return new DeviceAuthMethodHandler[i13];
            case 10:
                return new GetTokenLoginMethodHandler[i13];
            case 11:
                return new InstagramAppLoginMethodHandler[i13];
            case 12:
                return new KatanaProxyLoginMethodHandler[i13];
            case 13:
                return new LoginClient[i13];
            case 14:
                return new WebViewLoginMethodHandler[i13];
            case 15:
                return new ShareFeedContent[i13];
            case 16:
                return new AppGroupCreationContent[i13];
            case 17:
                return new CameraEffectArguments[i13];
            case 18:
                return new CameraEffectTextures[i13];
            case 19:
                return new GameRequestContent[i13];
            case 20:
                return new ShareCameraEffectContent[i13];
            case 21:
                return new ShareHashtag[i13];
            case 22:
                return new ShareLinkContent[i13];
            case 23:
                return new ShareMediaContent[i13];
            case 24:
                return new ShareMessengerURLActionButton[i13];
            case 25:
                return new SharePhoto[i13];
            case 26:
                return new SharePhotoContent[i13];
            case 27:
                return new ShareStoryContent[i13];
            case 28:
                return new ShareVideo[i13];
            default:
                return new ShareVideoContent[i13];
        }
    }
}
