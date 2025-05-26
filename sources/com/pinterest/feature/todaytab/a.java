package com.pinterest.feature.todaytab;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.api.model.qw;
import com.pinterest.feature.todaytab.tab.view.UsecaseLocation;
import com.pinterest.feature.unifiedcomments.CommentsFeatureLocation;
import com.pinterest.feature.video.model.VideoFeatureLocation;
import com.pinterest.framework.screens.NoneLocation;
import com.pinterest.ideaPinDisplay.screen.IdeaPinDisplayLocation;
import com.pinterest.identity.account.AccountLocation;
import com.pinterest.partnerAnalytics.PartnerAnalyticsLocation;
import com.pinterest.qrCodeLogin.QrCodeLoginLocation;
import com.pinterest.recoveryv2p.RecoveryScreenLocation;
import com.pinterest.reportFlow.feature.ReportFlowScreenLocation;
import com.pinterest.repository.TypedId;
import com.pinterest.repository.pinnableimagefeed.PinnableImageFeed;
import com.pinterest.schoolTeenPrompt.SchoolTeenPromptLocation;
import com.pinterest.screens.AmazonHandshakeLocation;
import com.pinterest.screens.PinItFeatureLocation;
import com.pinterest.screens.TargetHandshakeLocation;
import com.pinterest.searchLanding.framework.screens.SearchLandingFeatureLocation;
import com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation;
import com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation;
import com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation;
import com.pinterest.settingsPersonalInformation.framework.screens.SettingsPersonalInformationFeatureLocation;
import com.pinterest.share.board.video.screens.ShareBoardVideoLocation;
import com.pinterest.shuffles.core.ui.model.BitmapMaskModel;
import com.pinterest.shuffles.core.ui.model.CutoutModel;
import com.pinterest.shuffles.core.ui.model.MaskModel;
import com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.base.UnguessableToken;

/* loaded from: classes5.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48603a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        switch (this.f48603a) {
            case 0:
                if (source == null) {
                    return null;
                }
                try {
                    String readString = source.readString();
                    if (readString != null) {
                        return TodayTabLocation.valueOf(readString);
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            case 1:
                if (source == null) {
                    return null;
                }
                try {
                    String readString2 = source.readString();
                    if (readString2 != null) {
                        return UsecaseLocation.valueOf(readString2);
                    }
                    return null;
                } catch (Throwable unused2) {
                    return null;
                }
            case 2:
                if (source == null) {
                    return null;
                }
                try {
                    String readString3 = source.readString();
                    if (readString3 != null) {
                        return CommentsFeatureLocation.valueOf(readString3);
                    }
                    return null;
                } catch (Throwable unused3) {
                    return null;
                }
            case 3:
                if (source == null) {
                    return null;
                }
                try {
                    String readString4 = source.readString();
                    if (readString4 != null) {
                        return VideoFeatureLocation.valueOf(readString4);
                    }
                    return null;
                } catch (Throwable unused4) {
                    return null;
                }
            case 4:
                if (source == null) {
                    return null;
                }
                try {
                    String readString5 = source.readString();
                    if (readString5 != null) {
                        return NoneLocation.valueOf(readString5);
                    }
                    return null;
                } catch (Throwable unused5) {
                    return null;
                }
            case 5:
                if (source == null) {
                    return null;
                }
                try {
                    String readString6 = source.readString();
                    if (readString6 != null) {
                        return IdeaPinDisplayLocation.valueOf(readString6);
                    }
                    return null;
                } catch (Throwable unused6) {
                    return null;
                }
            case 6:
                if (source == null) {
                    return null;
                }
                try {
                    String readString7 = source.readString();
                    if (readString7 != null) {
                        return AccountLocation.valueOf(readString7);
                    }
                    return null;
                } catch (Throwable unused7) {
                    return null;
                }
            case 7:
                if (source == null) {
                    return null;
                }
                try {
                    String readString8 = source.readString();
                    if (readString8 != null) {
                        return PartnerAnalyticsLocation.valueOf(readString8);
                    }
                    return null;
                } catch (Throwable unused8) {
                    return null;
                }
            case 8:
                if (source == null) {
                    return null;
                }
                try {
                    String readString9 = source.readString();
                    if (readString9 != null) {
                        return QrCodeLoginLocation.valueOf(readString9);
                    }
                    return null;
                } catch (Throwable unused9) {
                    return null;
                }
            case 9:
                if (source == null) {
                    return null;
                }
                try {
                    String readString10 = source.readString();
                    if (readString10 != null) {
                        return RecoveryScreenLocation.valueOf(readString10);
                    }
                    return null;
                } catch (Throwable unused10) {
                    return null;
                }
            case 10:
                if (source == null) {
                    return null;
                }
                try {
                    String readString11 = source.readString();
                    if (readString11 != null) {
                        return ReportFlowScreenLocation.valueOf(readString11);
                    }
                    return null;
                } catch (Throwable unused11) {
                    return null;
                }
            case 11:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(source, "source");
                String readString12 = source.readString();
                Intrinsics.f(readString12);
                return new TypedId(readString12, qw.values()[source.readInt()]);
            case 12:
                return new PinnableImageFeed(source);
            case 13:
                if (source == null) {
                    return null;
                }
                try {
                    String readString13 = source.readString();
                    if (readString13 != null) {
                        return SchoolTeenPromptLocation.valueOf(readString13);
                    }
                    return null;
                } catch (Throwable unused12) {
                    return null;
                }
            case 14:
                if (source == null) {
                    return null;
                }
                try {
                    String readString14 = source.readString();
                    if (readString14 != null) {
                        return AmazonHandshakeLocation.valueOf(readString14);
                    }
                    return null;
                } catch (Throwable unused13) {
                    return null;
                }
            case 15:
                if (source == null) {
                    return null;
                }
                try {
                    String readString15 = source.readString();
                    if (readString15 != null) {
                        return PinItFeatureLocation.valueOf(readString15);
                    }
                    return null;
                } catch (Throwable unused14) {
                    return null;
                }
            case 16:
                if (source == null) {
                    return null;
                }
                try {
                    String readString16 = source.readString();
                    if (readString16 != null) {
                        return TargetHandshakeLocation.valueOf(readString16);
                    }
                    return null;
                } catch (Throwable unused15) {
                    return null;
                }
            case 17:
                if (source == null) {
                    return null;
                }
                try {
                    String readString17 = source.readString();
                    if (readString17 != null) {
                        return SearchLandingFeatureLocation.valueOf(readString17);
                    }
                    return null;
                } catch (Throwable unused16) {
                    return null;
                }
            case 18:
                if (source == null) {
                    return null;
                }
                try {
                    String readString18 = source.readString();
                    if (readString18 != null) {
                        return SearchResultsFeatureLocation.valueOf(readString18);
                    }
                    return null;
                } catch (Throwable unused17) {
                    return null;
                }
            case 19:
                if (source == null) {
                    return null;
                }
                try {
                    String readString19 = source.readString();
                    if (readString19 != null) {
                        return SearchTypeaheadFeatureLocation.valueOf(readString19);
                    }
                    return null;
                } catch (Throwable unused18) {
                    return null;
                }
            case 20:
                if (source == null) {
                    return null;
                }
                try {
                    String readString20 = source.readString();
                    if (readString20 != null) {
                        return SettingsAccountFeatureLocation.valueOf(readString20);
                    }
                    return null;
                } catch (Throwable unused19) {
                    return null;
                }
            case 21:
                if (source == null) {
                    return null;
                }
                try {
                    String readString21 = source.readString();
                    if (readString21 != null) {
                        return SettingsPersonalInformationFeatureLocation.valueOf(readString21);
                    }
                    return null;
                } catch (Throwable unused20) {
                    return null;
                }
            case 22:
                if (source == null) {
                    return null;
                }
                try {
                    String readString22 = source.readString();
                    if (readString22 != null) {
                        return ShareBoardVideoLocation.valueOf(readString22);
                    }
                    return null;
                } catch (Throwable unused21) {
                    return null;
                }
            case 23:
                Intrinsics.checkNotNullParameter(source, "parcel");
                return new BitmapMaskModel(source.readFloat(), source.readFloat(), source.readFloat(), source.readFloat(), source.readString());
            case 24:
                Intrinsics.checkNotNullParameter(source, "parcel");
                return new CutoutModel(source.readString(), source.readInt(), source.readInt(), source.readString(), source.readString(), source.readString(), MaskModel.CREATOR.createFromParcel(source), source.readString(), source.readString(), source.readInt() != 0);
            case 25:
                Intrinsics.checkNotNullParameter(source, "parcel");
                return new MaskModel(source.readString(), source.readInt() != 0 ? BitmapMaskModel.CREATOR.createFromParcel(source) : null);
            case 26:
                if (source == null) {
                    return null;
                }
                try {
                    String readString23 = source.readString();
                    if (readString23 != null) {
                        return WidgetConfigurationFeatureLocation.valueOf(readString23);
                    }
                    return null;
                } catch (Throwable unused22) {
                    return null;
                }
            default:
                long readLong = source.readLong();
                long readLong2 = source.readLong();
                if (readLong == 0 || readLong2 == 0) {
                    return null;
                }
                return new UnguessableToken(readLong, readLong2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f48603a) {
            case 0:
                return new TodayTabLocation[i13];
            case 1:
                return new UsecaseLocation[i13];
            case 2:
                return new CommentsFeatureLocation[i13];
            case 3:
                return new VideoFeatureLocation[i13];
            case 4:
                return new NoneLocation[i13];
            case 5:
                return new IdeaPinDisplayLocation[i13];
            case 6:
                return new AccountLocation[i13];
            case 7:
                return new PartnerAnalyticsLocation[i13];
            case 8:
                return new QrCodeLoginLocation[i13];
            case 9:
                return new RecoveryScreenLocation[i13];
            case 10:
                return new ReportFlowScreenLocation[i13];
            case 11:
                return new TypedId[i13];
            case 12:
                return new PinnableImageFeed[i13];
            case 13:
                return new SchoolTeenPromptLocation[i13];
            case 14:
                return new AmazonHandshakeLocation[i13];
            case 15:
                return new PinItFeatureLocation[i13];
            case 16:
                return new TargetHandshakeLocation[i13];
            case 17:
                return new SearchLandingFeatureLocation[i13];
            case 18:
                return new SearchResultsFeatureLocation[i13];
            case 19:
                return new SearchTypeaheadFeatureLocation[i13];
            case 20:
                return new SettingsAccountFeatureLocation[i13];
            case 21:
                return new SettingsPersonalInformationFeatureLocation[i13];
            case 22:
                return new ShareBoardVideoLocation[i13];
            case 23:
                return new BitmapMaskModel[i13];
            case 24:
                return new CutoutModel[i13];
            case 25:
                return new MaskModel[i13];
            case 26:
                return new WidgetConfigurationFeatureLocation[i13];
            default:
                return new UnguessableToken[i13];
        }
    }
}
