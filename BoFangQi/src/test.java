import java.awt.Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

	public static Scanner input = new Scanner(System.in);
	public static int inputnum;
	public static String inputString;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub��
		//�������б�
		PlayList mainplaylist=new PlayList("�������б�",0);
		//��ͨ�����б�
		List normalplaylist=new ArrayList();
		Menu(mainplaylist,normalplaylist);
		
	}
	
	
	public static void Menu(PlayList mainplaylist,List normalplaylist) {	
		
		ShowMenu();
		inputnum=input.nextInt();
		
		while(true) {
			if (inputnum==1) {//......
				PlayListManage(mainplaylist,normalplaylist);
				ShowMenu();
				inputnum=input.nextInt();
			}
			else if (inputnum==2) {//......
				PlayerManage(mainplaylist,normalplaylist);
				ShowMenu();
				inputnum=input.nextInt();
			}
			else if (inputnum==0) {//���				
				System.out.println("�˳�");
				break;
			}
			else {
				System.out.println("���������룡");
				ShowMenu();
			}				
		}			
	}
	
	public static void PlayListManage(PlayList mainplaylist,List normalplaylist) {	
		ShowPlayListManage();
		inputnum=input.nextInt();
		
		while(true) {
			if (inputnum==1) {//......
				//1.
				SongAddToMainPlayList(mainplaylist,normalplaylist);
				ShowPlayListManage();
				inputnum=input.nextInt();
			}
			else if (inputnum==2) {//......
				//2.
				SongAddToNormalPlayList(mainplaylist,normalplaylist);
				ShowPlayListManage();
				inputnum=input.nextInt();
			}
			else if (inputnum==3) {//......
				//3.
				QuarySongByIDFromList(mainplaylist,normalplaylist);
				ShowPlayListManage();
				inputnum=input.nextInt();
			}
			else if (inputnum==4) {//......
				//4.
				QuarySongByTitleFromList(mainplaylist,normalplaylist);
				ShowPlayListManage();
				inputnum=input.nextInt();
			}
			else if (inputnum==5) {//......
				//5.
				ResetSongFromList(mainplaylist,normalplaylist);
				ShowPlayListManage();
				inputnum=input.nextInt();
			}
			else if (inputnum==6) {//......
				//6.
				DeleteSongFormList(mainplaylist,normalplaylist);
				ShowPlayListManage();
				inputnum=input.nextInt();
			}
			else if (inputnum==7) {//......
				//7.
				RevealSongFromList(mainplaylist,normalplaylist);
				ShowPlayListManage();
				inputnum=input.nextInt();
			}
			else if (inputnum==8) {//���				
				System.out.println("����");
				break;
			}
			else {
				System.out.println("���������룡");
				ShowPlayListManage();
			}				
		}
		
	}
	
	public static void PlayerManage(PlayList mainplaylist,List normalplaylist) {		
		ShowPlayertManage();
		inputnum=input.nextInt();
		
		while(true) {
			if (inputnum==1) {//......
				//1.
				PlaylistAddToPlayer(mainplaylist,normalplaylist);
				ShowPlayertManage();
				inputnum=input.nextInt();
			}
			else if (inputnum==2) {//......
				//2.
				DeletePlaylistFromPlayer(mainplaylist,normalplaylist);
				ShowPlayertManage();
				inputnum=input.nextInt();
			}
			else if (inputnum==3) {//......
				//3.
				QuaryPLayListByTitle(mainplaylist,normalplaylist);
				ShowPlayertManage();
				inputnum=input.nextInt();
			}
			else if (inputnum==4) {//......
				//4.
				RevealAllPlaylist(mainplaylist,normalplaylist);
				ShowPlayertManage();
				inputnum=input.nextInt();
			}
			else if (inputnum==5) {//......
				//5.
				System.out.println("����");
				break;
			}
			else {
				System.out.println("���������룡");
				ShowPlayertManage();
			}				
		}
	}
	
	public static void SongAddToMainPlayList(PlayList mainplaylist,List normalplaylist) {//��������ӵ��������б�
		String id;
		String title;
		String singer;
		
		System.out.println("**********************");
		System.out.println("�����������ID");
		id=input.next();
		System.out.println("���������������");
		title=input.next();
		System.out.println("����������ĸ�����");
		singer=input.next();
		
		Song song = new Song(id,title,singer);
		
		mainplaylist.list.add(song);
		mainplaylist.setLength(mainplaylist.getLength()+1);
		
		System.out.println("¼�����");
	}
	public static void SongAddToNormalPlayList(PlayList mainplaylist,List normalplaylist) {//��������ӵ���ͨ�����б�
		String title;
		String songID;
		String songTitle;
		String songSinger; 
		int i;
		boolean flag=false;
		
		
		System.out.println("**********************");
		System.out.println("�������Ӧ��ͨ�赥������");
		title = input.next();
		
		for (i=0;i<normalplaylist.size();i++) {
			if ( ((PlayList)(normalplaylist.get(i))).getTitle()==title   ) {
				flag=true;
				break;
			}
		}
		
		if (flag==false) {
			System.out.println("δ�ҵ��赥");
			return;
		}
		
		System.out.println("���������ID");
		songID=input.next();
		System.out.println("�������������");
		songTitle=input.next();
		System.out.println("�������������");
		songSinger=input.next();
		
		Song song=new Song(songID, songTitle, songSinger);
		((PlayList)(normalplaylist.get(i))).list.add(song);
		
		
		
		
	}
	public static void QuarySongByIDFromList(PlayList mainplaylist,List normalplaylist) {//ͨ������id��ѯ�����б��еĸ���
		System.out.println("ͨ������id��ѯ�����б��еĸ���");
	}
	public static void QuarySongByTitleFromList(PlayList mainplaylist,List normalplaylist) {//ͨ���������Ʋ�ѯ�����б��еĸ���
		System.out.println("ͨ���������Ʋ�ѯ�����б��еĸ���");
	}
	public static void ResetSongFromList(PlayList mainplaylist,List normalplaylist) {//�޸Ĳ����б��еĸ���
		System.out.println("�޸Ĳ����б��еĸ���");
	}
	public static void DeleteSongFormList(PlayList mainplaylist,List normalplaylist) {//ɾ�������б��еĸ���
		System.out.println("ɾ�������б��еĸ���");
	}
	public static void RevealSongFromList(PlayList mainplaylist,List normalplaylist) {//��ʾ�����б��е����и���
		System.out.println("��ʾ�����б��е����и���");
	}
	
	//....................................................................
	public static void PlaylistAddToPlayer(PlayList mainplaylist,List normalplaylist) {
		PlayList tplalist=new PlayList();
		String title;
		
		System.out.println("**********************");
		System.out.println("��������ͨ�����б�ı���");
		title=input.next();
		tplalist.setTitle(title);
		tplalist.setLength(0);
		System.out.println("¼�����");
		
	}
	public static void DeletePlaylistFromPlayer(PlayList mainplaylist,List normalplaylist) {
		String title;
		
		System.out.println("**********************");
		System.out.println("��������Ҫɾ�����б������");
		title=input.next();
		
		for (int i=0;i<normalplaylist.size();i++) {
			if ( ((PlayList)(normalplaylist.get(i))).getTitle()==title ) {
				normalplaylist.remove(normalplaylist.get(i));
				break;
			}
		}
		System.out.println("ɾ����ϣ�");
		
		
	}
	public static void QuaryPLayListByTitle(PlayList mainplaylist,List normalplaylist) {
		String title;
		boolean flag=false;
		
		System.out.println("**********************");
		System.out.println("��������Ҫ���ҵ��б������");
		title=input.next();
		
		for (int i=0;i<normalplaylist.size();i++) {
			if ( ((PlayList)(normalplaylist.get(i))).getTitle()==title ) {
				System.out.println("�б�����Ϊ"+((PlayList)(normalplaylist.get(i))).getTitle());
				System.out.println("�б���Ϊ"+((PlayList)(normalplaylist.get(i))).list.size());
				flag=true;
				break;
			}
		}
		
		if (flag==false) {
			System.out.println("����ʧ��");
		}
		
	}
	public static void RevealAllPlaylist(PlayList mainplaylist,List normalplaylist) {
		System.out.println("**********************");
		System.out.println(mainplaylist.getTitle());
		
		for (int i=0;i<normalplaylist.size();i++) {
			System.out.println(((PlayList)(normalplaylist.get(i))).getTitle());
		}
		
	}
	
	
	
	public static void ShowMenu() {
		System.out.println("**********************");
		System.out.println("1--�����б����");
		System.out.println("2--����������");
		System.out.println("0--�˳�");
		System.out.println("**********************");
		System.out.println("�������Ӧ���ֽ��в�����");
	}
	
	public static void ShowPlayListManage() {
		System.out.println("**********************");
		System.out.println("##�����б����##");
		System.out.println("1--��������ӵ��������б�");
		System.out.println("2--��������ӵ���ͨ�����б�");
		System.out.println("3--ͨ������id��ѯ�����б��еĸ���");
		System.out.println("4--ͨ���������Ʋ�ѯ�����б��еĸ���");
		System.out.println("5--�޸Ĳ����б��еĸ���");
		System.out.println("6--ɾ�������б��еĸ���");
		System.out.println("7--��ʾ�����б��е����и���");
		System.out.println("8--������һ���˵�");
		System.out.println("**********************");
	}
	
	public static void ShowPlayertManage() {
		System.out.println("**********************");
		System.out.println("##����������##");
		System.out.println("1--�򲥷�����Ӳ����б�");
		System.out.println("2--�Ӳ�����ɾ�������б�");
		System.out.println("3--ͨ�����ֲ�ѯ�����б����Ϣ");
		System.out.println("4--ͨ���������Ʋ�ѯ�����б��еĸ���");
		System.out.println("5--�޸Ĳ����б��еĸ���");
		System.out.println("6--ɾ�������б��еĸ���");
		System.out.println("7--��ʾ�����б��е����и���");
		System.out.println("8--������һ���˵�");
		System.out.println("**********************");
	}
	

}
