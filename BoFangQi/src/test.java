import java.awt.Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

	public static Scanner input = new Scanner(System.in);
	public static int inputnum;
	public static String inputString;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub、
		//主播放列表
		PlayList mainplaylist=new PlayList("主播放列表",0);
		//普通播放列表
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
			else if (inputnum==0) {//完成				
				System.out.println("退出");
				break;
			}
			else {
				System.out.println("请重新输入！");
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
			else if (inputnum==8) {//完成				
				System.out.println("返回");
				break;
			}
			else {
				System.out.println("请重新输入！");
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
				System.out.println("返回");
				break;
			}
			else {
				System.out.println("请重新输入！");
				ShowPlayertManage();
			}				
		}
	}
	
	public static void SongAddToMainPlayList(PlayList mainplaylist,List normalplaylist) {//将歌曲添加到主播放列表
		String id;
		String title;
		String singer;
		
		System.out.println("**********************");
		System.out.println("请输入歌曲的ID");
		id=input.next();
		System.out.println("请输入歌曲的名称");
		title=input.next();
		System.out.println("请输入歌曲的歌手名");
		singer=input.next();
		
		Song song = new Song(id,title,singer);
		
		mainplaylist.list.add(song);
		mainplaylist.setLength(mainplaylist.getLength()+1);
		
		System.out.println("录入完毕");
	}
	public static void SongAddToNormalPlayList(PlayList mainplaylist,List normalplaylist) {//将歌曲添加到普通播放列表
		String title;
		String songID;
		String songTitle;
		String songSinger; 
		int i;
		boolean flag=false;
		
		
		System.out.println("**********************");
		System.out.println("请输入对应普通歌单的名称");
		title = input.next();
		
		for (i=0;i<normalplaylist.size();i++) {
			if ( ((PlayList)(normalplaylist.get(i))).getTitle()==title   ) {
				flag=true;
				break;
			}
		}
		
		if (flag==false) {
			System.out.println("未找到歌单");
			return;
		}
		
		System.out.println("请输入歌曲ID");
		songID=input.next();
		System.out.println("请输入歌曲名称");
		songTitle=input.next();
		System.out.println("请输入歌曲歌手");
		songSinger=input.next();
		
		Song song=new Song(songID, songTitle, songSinger);
		((PlayList)(normalplaylist.get(i))).list.add(song);
		
		
		
		
	}
	public static void QuarySongByIDFromList(PlayList mainplaylist,List normalplaylist) {//通过歌曲id查询播放列表中的歌曲
		System.out.println("通过歌曲id查询播放列表中的歌曲");
	}
	public static void QuarySongByTitleFromList(PlayList mainplaylist,List normalplaylist) {//通过歌曲名称查询播放列表中的歌曲
		System.out.println("通过歌曲名称查询播放列表中的歌曲");
	}
	public static void ResetSongFromList(PlayList mainplaylist,List normalplaylist) {//修改播放列表中的歌曲
		System.out.println("修改播放列表中的歌曲");
	}
	public static void DeleteSongFormList(PlayList mainplaylist,List normalplaylist) {//删除播放列表中的歌曲
		System.out.println("删除播放列表中的歌曲");
	}
	public static void RevealSongFromList(PlayList mainplaylist,List normalplaylist) {//显示播放列表中的所有歌曲
		System.out.println("显示播放列表中的所有歌曲");
	}
	
	//....................................................................
	public static void PlaylistAddToPlayer(PlayList mainplaylist,List normalplaylist) {
		PlayList tplalist=new PlayList();
		String title;
		
		System.out.println("**********************");
		System.out.println("请输入普通播放列表的标题");
		title=input.next();
		tplalist.setTitle(title);
		tplalist.setLength(0);
		System.out.println("录入完毕");
		
	}
	public static void DeletePlaylistFromPlayer(PlayList mainplaylist,List normalplaylist) {
		String title;
		
		System.out.println("**********************");
		System.out.println("请输入需要删除的列表的名称");
		title=input.next();
		
		for (int i=0;i<normalplaylist.size();i++) {
			if ( ((PlayList)(normalplaylist.get(i))).getTitle()==title ) {
				normalplaylist.remove(normalplaylist.get(i));
				break;
			}
		}
		System.out.println("删除完毕！");
		
		
	}
	public static void QuaryPLayListByTitle(PlayList mainplaylist,List normalplaylist) {
		String title;
		boolean flag=false;
		
		System.out.println("**********************");
		System.out.println("请输入需要查找的列表的名称");
		title=input.next();
		
		for (int i=0;i<normalplaylist.size();i++) {
			if ( ((PlayList)(normalplaylist.get(i))).getTitle()==title ) {
				System.out.println("列表名称为"+((PlayList)(normalplaylist.get(i))).getTitle());
				System.out.println("列表长度为"+((PlayList)(normalplaylist.get(i))).list.size());
				flag=true;
				break;
			}
		}
		
		if (flag==false) {
			System.out.println("查找失败");
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
		System.out.println("1--播放列表管理");
		System.out.println("2--播放器管理");
		System.out.println("0--退出");
		System.out.println("**********************");
		System.out.println("请输入对应数字进行操作：");
	}
	
	public static void ShowPlayListManage() {
		System.out.println("**********************");
		System.out.println("##播放列表管理##");
		System.out.println("1--将歌曲添加到主播放列表");
		System.out.println("2--将歌曲添加到普通播放列表");
		System.out.println("3--通过歌曲id查询播放列表中的歌曲");
		System.out.println("4--通过歌曲名称查询播放列表中的歌曲");
		System.out.println("5--修改播放列表中的歌曲");
		System.out.println("6--删除播放列表中的歌曲");
		System.out.println("7--显示播放列表中的所有歌曲");
		System.out.println("8--返回上一级菜单");
		System.out.println("**********************");
	}
	
	public static void ShowPlayertManage() {
		System.out.println("**********************");
		System.out.println("##播放器管理##");
		System.out.println("1--向播放器添加播放列表");
		System.out.println("2--从播放器删除播放列表");
		System.out.println("3--通过名字查询播放列表的信息");
		System.out.println("4--通过歌曲名称查询播放列表中的歌曲");
		System.out.println("5--修改播放列表中的歌曲");
		System.out.println("6--删除播放列表中的歌曲");
		System.out.println("7--显示播放列表中的所有歌曲");
		System.out.println("8--返回上一级菜单");
		System.out.println("**********************");
	}
	

}
